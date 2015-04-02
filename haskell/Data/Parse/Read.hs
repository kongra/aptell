{-# LANGUAGE Trustworthy #-}
------------------------------------------------------------------------
-- |
-- Module      : Data.Parse.Read
-- Copyright   : (c) 2015 Konrad Grzanek
-- License     : BSD-style (see the file LICENSE)
-- Created     : 2015-03-02
-- Maintainer  : kongra@gmail.com
-- Stability   : experimental
------------------------------------------------------------------------
module Data.Parse.Read where

import qualified Data.ByteString.Lazy as B
import           Data.Binary.Get
import           Data.Word
import qualified Data.Text.Encoding as E
import qualified Data.Text as T

lorem :: String
lorem = "ąęśćółżźńLorem ipsum dolor sit amet, consectetur adipisicing elit."

readRecord :: Get (Word8, Word32, Word32, String)
readRecord = do
  b <- getWord8
  w <- getWord32be
  l <- getWord32be

  s <- getByteString (fromIntegral l)
  let s1 = T.unpack $ E.decodeUtf8 s

  return (b, w, l, s1)

main :: IO ()
main = do
  contents <- B.readFile "/home/kongra/Pulpit/IO/IO.log"
  let r            = runGet readRecord contents
      (b, w, l, s) = r
  putStrLn $ show b
  putStrLn $ show w
  putStrLn $ show l
  putStrLn s
  putStrLn lorem

  putStrLn $ show (lorem == s)
  print (length lorem)
  print (length s)
