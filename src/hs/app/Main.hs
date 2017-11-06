{-# LANGUAGE Safe #-}
------------------------------------------------------------------------
-- |
-- Module      : Main
-- Copyright   : (c) Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2017-11-05
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
-- Portability : portable
------------------------------------------------------------------------
module Main (main) where

import Aptell.Tools     (doAptlFiles)
import Aptell.Aptl.Java (parseTree)
import Aptell.Aptl.Algo (treeSize)

main :: IO ()
main = doAptlFiles "/home/kongra/Pulpit/JDK9/aptl" $ \f -> do
  node <- parseTree f
  let s = treeSize node
  putStrLn (f ++ "," ++ (show s))
