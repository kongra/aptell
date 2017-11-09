{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE Trustworthy #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.IO
-- Copyright   : (c) Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2017-11-06
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.IO
    (
      filesWithExt
    , forFiles
    , mapFiles

    , forAptlFiles
    , mapAptlFiles

    , FileIOAction
    , FileIOTrans
    )
    where

import Conduit
import System.FilePath (takeExtension)

filesWithExt :: String -> FilePath -> IO [FilePath]
filesWithExt ext dir = runConduitRes
                     $ sourceDirectoryDeep True dir
                    .| filterC (\fp -> takeExtension fp == ext)
                    .| sinkList

type FileIOAction  = FilePath -> IO ()
type FileIOTrans a = FilePath -> IO a

forFiles :: String -> FilePath -> FileIOAction -> IO ()
forFiles ext dir action
  = runConduitRes
  $ sourceDirectoryDeep True dir
 .| filterC (\fp -> takeExtension fp == ext)
 .| mapM_C (liftIO . action)

mapFiles :: String -> FilePath -> FileIOTrans a -> IO [a]
mapFiles ext dir trans
  = runConduitRes
  $ sourceDirectoryDeep True dir
 .| filterC (\fp -> takeExtension fp == ext)
 .| mapMC (liftIO . trans)
 .| sinkList

forAptlFiles :: FilePath -> FileIOAction -> IO ()
forAptlFiles = forFiles ".aptl"
{-# INLINE forAptlFiles #-}

mapAptlFiles :: FilePath ->  FileIOTrans a -> IO [a]
mapAptlFiles = mapFiles ".aptl"
{-# INLINE mapAptlFiles #-}
