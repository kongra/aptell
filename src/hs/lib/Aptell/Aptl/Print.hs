{-# LANGUAGE Safe             #-}
{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE MonoLocalBinds   #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Aptl.Print
-- Copyright   : (c) Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-04-10
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Aptl.Print
    (
      printNode
    , toString
    , toStringD
    )
    where

import           Aptell.Aptl
import qualified Data.Text as T
import           Kask.Data.Tree.Print
import qualified Kask.Print as P

nodeAdjs :: Adjs (Node a) []
nodeAdjs Terminal    {}                          = []
nodeAdjs NonTerminal { nodeChildren = children } = children

nodeShow :: Prelude.Show a => Node a -> String
nodeShow (NonTerminal rule _     ) = show rule
nodeShow (Terminal    lin pos txt) = P.evalShowS $
  P.strCat [ showString (T.unpack txt)
           , showString "("
           , shows lin
           , showString ","
           , shows pos
           , showString ") "]

printNode :: (Prelude.Show a, P.Printable m String) => Node a -> Maybe Depth -> m ()
printNode node = printTree node nodeAdjs nodeShow

toStringD :: Prelude.Show a => Node a -> Maybe Depth -> String
toStringD node maxDepth = P.toString (printNode node maxDepth)

toString :: Prelude.Show a => Node a -> String
toString node = toStringD node Nothing
