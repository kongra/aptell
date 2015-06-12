{-# LANGUAGE Safe #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Data
-- Copyright   : (c) 2015 Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-04-02
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Data
    (
      Node (..)
    , Code2Rule
    , parseForest
    )
    where

import           Control.Monad (liftM)
import qualified Data.Binary.Get      as G
import qualified Data.ByteString.Lazy as B
import qualified Data.HashMap.Strict  as M
import qualified Data.Text            as T
import qualified Data.Text.Encoding   as E

-- | Unified parse-tree node.
data Node a =
  Terminal
  {
    nodeLine :: !Int
  , nodePos  :: !Int
  , nodeText :: !T.Text
  }
  |
  NonTerminal
  {
    nodeRule     :: !a
  , nodeChildren :: ![Node a]
  }

isTerminal :: Node a -> Bool
isTerminal Terminal    {} = True
isTerminal NonTerminal {} = False
{-# INLINE isTerminal #-}

-- DE-SERIALIZATION OF ANTLR PARSE-TREES

-- | Returns a rule representation for a given integral code.
type Code2Rule a = Int -> a

-- | Reads Aptl file (given as its path) and returns its representation.
parseForest :: Code2Rule a -> String -> IO [Node a]
parseForest c2r file = liftM (hierarchy M.empty . reverse) (flatNodes c2r file)

flatNodes :: Code2Rule a -> String -> IO [(Int, Node a)]
flatNodes c2r file = liftM (G.runGet (getFlatNodes c2r)) (B.readFile file)
{-# INLINE flatNodes #-}

getFlatNodes :: Code2Rule a -> G.Get [(Int, Node a)]
getFlatNodes c2r = do
  eof <- G.isEmpty
  if eof
    then return []
    else do
      level <- G.getWord32be
      code  <- G.getWord32be
      node  <- case code of
        0 -> do  -- 0 is a terminal, see IO.java l. 35
          line <- G.getWord32be
          pos  <- G.getWord32be
          len  <- G.getWord32be
          txt  <- G.getByteString (fromIntegral len)
          return $! Terminal      (fromIntegral line)
                                  (fromIntegral pos )
                                  (E.decodeUtf8 txt )

        _ -> return $! NonTerminal (c2r (fromIntegral code)) []

      liftM ((fromIntegral level, node):) (getFlatNodes c2r)

type Level2Children a = M.HashMap Int [Node a]

hierarchy ::  Level2Children a -> [(Int, Node a)] -> [Node a]
hierarchy l2ch []                 = M.lookupDefault [] 0 l2ch
hierarchy l2ch ((level, node):ns) = hierarchy l2ch2 ns
  where
    -- 1. Update node with children; nodes for current level.
    node' = if isTerminal node then node
            else node { nodeChildren = M.lookupDefault [] level l2ch }

    -- 2. Clear children for current level.
    l2ch1 = M.delete level l2ch

    -- 3. Register updated node as a child for level-1.
    childrenAbove = M.lookupDefault [] (level-1) l2ch1
    l2ch2         = M.insert (level-1) (node':childrenAbove) l2ch1
