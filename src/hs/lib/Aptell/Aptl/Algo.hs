{-# LANGUAGE Safe #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Aptl.Algo
-- Copyright   : (c) Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2017-11-06
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Aptl.Algo
    (
      treeSize
    )
    where

import Aptell.Aptl
import Data.List (foldl')

treeSize :: Node a -> Int
treeSize Terminal    {} = 1
treeSize NonTerminal { nodeChildren = children} =
  1 + foldl' (+) 0 (fmap treeSize children)
