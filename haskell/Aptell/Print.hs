{-# LANGUAGE Trustworthy           #-}
{-# LANGUAGE MultiParamTypeClasses #-}
------------------------------------------------------------------------
-- |
-- Module      : Aptell.Print
-- Copyright   : (c) 2015 Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-04-10
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Aptell.Print where

import           Aptell.Data
import           Control.Monad.Identity (Identity)
import qualified Data.Text as T
import           Data.Tree.Print
import           Kask.Data.Function (compose)

data Opts a =
  Opts
  { optsPrintLocations :: !Bool
  , optsRulePrinter    :: !(a -> ShowS) }

instance ShowM Identity (Opts a) (Node a) where
  showM o (NonTerminal rule _      ) = return $ (optsRulePrinter o) rule
  showM o (Terminal    line pos txt) = do
    let s = showString (T.unpack txt)
    if optsPrintLocations o
      then return $ compose
           [ showString "("
           , shows line
           , showString ","
           , shows pos
           , showString ") "
           , s]
      else return s
