{-# LANGUAGE Safe                  #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE FlexibleContexts      #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Print
-- Copyright   : (c) 2015 Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-04-10
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Print
    (
      RulePrinter
    , toString
    , toStringD
    )
    where

import           Aptell.Data
import           Control.Monad.Identity (Identity, runIdentity)
import qualified Data.Text as T
import           Data.Tree.Print
import           Kask.Data.Function (compose)

type RulePrinter a = a -> ShowS

data Opts a =
  Opts
  { optsPrintLocations :: !Bool
  , optsRulePrinter    :: !(RulePrinter a) }

instance ShowM Identity (Opts a) (Node a) where
  showM o (NonTerminal rule _      ) = return $ optsRulePrinter o rule
  showM o (Terminal    line pos txt) = do
    let s = showString (T.unpack txt)
    if optsPrintLocations o
      then return $ compose
           [ s
           , showString "("
           , shows line
           , showString ","
           , shows pos
           , showString ") " ]
      else return s

nodeAdjs :: Adjs Identity (Opts a) (Node a)
nodeAdjs _ Terminal    {}                          = return []
nodeAdjs _ NonTerminal { nodeChildren = children } = return children

toShowS :: RulePrinter a -> Maybe Int -> Bool -> Node a -> Identity ShowS
toShowS rp depth printLocations = printTree conf
  where
    conf = Conf istr nodeAdjs depth (Opts printLocations rp)

-- | Returns a textual representation of a parse tree represented by
-- its root node.
toString :: RulePrinter a -> Bool -> Node a -> String
toString rp printLocations =
  evalShowS . runIdentity . toShowS rp Nothing printLocations
  where evalShowS s = s ""

-- | Works like toString, but allows to pass a maximal depth.
toStringD :: RulePrinter a -> Int -> Bool -> Node a -> String
toStringD rp depth printLocations =
  evalShowS . runIdentity . toShowS rp (Just depth) printLocations
  where evalShowS s = s ""
