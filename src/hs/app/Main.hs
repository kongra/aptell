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

import Aptell.Aptl.Java (parseTree, printFile)
import Aptell.Aptl.Algo (treeSize)

f :: String
-- f = "/home/kongra/Pulpit/JDK9/aptl/java.base/java/lang/String.java.aptl"
-- f = "/home/kongra/Pulpit/JDK9/aptl/java.base/java/math/BigDecimal.java.aptl"
-- f = "/home/kongra/Pulpit/JDK9/aptl/jdk.zipfs/jdk/nio/zipfs/ZipUtils.java.aptl"
f = "/home/kongra/Pulpit/JDK9/aptl/java.corba/com/sun/corba/se/impl/logging/ORBUtilSystemException.java.aptl"

main :: IO ()
main = do
  node <- parseTree f
  print $ treeSize node
  -- printFile f
