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

import Aptell.Aptl.Java (printFile)

main :: IO ()
main = printFile "/home/kongra/Pulpit/String.java.aptl"
