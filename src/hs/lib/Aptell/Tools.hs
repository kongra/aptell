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
      doAptlFiles
    )
    where

import Conduit
import System.FilePath (takeExtension)

doAptlFiles :: FilePath ->  (FilePath -> IO ()) -> IO ()
doAptlFiles dir body = runConduitRes
                     $ sourceDirectoryDeep True dir
                    .| filterC (\fp -> takeExtension fp == ".aptl")
                    .| mapM_C (liftIO . body)
