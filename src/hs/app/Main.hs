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

import Aptell.Aptl.Algo (treeSize)
import Aptell.Aptl.Java (parseTree)
import qualified Aptell.IO as AIO

main :: IO ()
-- main = do
--   trees <- AIO.mapAptlFiles "/home/kongra/Pulpit/JDK9/aptl" $ \f -> do
--     putStrLn  f
--     parseTree f

--   print (length trees)

main = AIO.forAptlFiles "/home/kongra/Pulpit/JDK-10/aptl" $ \f -> do
  node <- parseTree f
  let s = treeSize node
  putStrLn (f ++ "," ++ show s)
