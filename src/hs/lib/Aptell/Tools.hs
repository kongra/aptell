{-# LANGUAGE Trustworthy #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Tools
-- Copyright   : (c) Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2017-11-06
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Tools
    (
      forFiles
    , forAptlFiles
    )
    where

import Conduit
import System.FilePath (takeExtension)

type FileIOAction = FilePath -> IO ()

forFiles :: String -> FilePath -> FileIOAction -> IO ()
forFiles ext dir action = runConduitRes
                        $ sourceDirectoryDeep True dir
                       .| filterC (\fp -> takeExtension fp == ext)
                       .| mapM_C (liftIO . action)

forAptlFiles :: FilePath -> FileIOAction -> IO ()
forAptlFiles = forFiles ".aptl"
