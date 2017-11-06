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
      test1
    )
    where

import Conduit

wc :: Monad m => Consumer FilePath m Int
wc = lengthC

test1 :: IO ()
test1 = runResourceT (sourceDirectoryDeep False "." $$ wc) >>= print

-- test2 :: MonadResource m => Producer m FilePath
-- test2 = sourceDirectoryDeep False "."
