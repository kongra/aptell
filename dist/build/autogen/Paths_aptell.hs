module Paths_aptell (
    version,
    getBinDir, getLibDir, getDataDir, getLibexecDir,
    getDataFileName, getSysconfDir
  ) where

import qualified Control.Exception as Exception
import Data.Version (Version(..))
import System.Environment (getEnv)
import Prelude

catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
catchIO = Exception.catch

version :: Version
version = Version [0,1,0,0] []
bindir, libdir, datadir, libexecdir, sysconfdir :: FilePath

bindir     = "/home/kongra/Devel/Projects/Haskell/aptell/.cabal-sandbox/bin"
libdir     = "/home/kongra/Devel/Projects/Haskell/aptell/.cabal-sandbox/lib/x86_64-linux-ghc-7.10.1/aptel_G52apfNmBOOBGEPUchm2fa"
datadir    = "/home/kongra/Devel/Projects/Haskell/aptell/.cabal-sandbox/share/x86_64-linux-ghc-7.10.1/aptell-0.1.0.0"
libexecdir = "/home/kongra/Devel/Projects/Haskell/aptell/.cabal-sandbox/libexec"
sysconfdir = "/home/kongra/Devel/Projects/Haskell/aptell/.cabal-sandbox/etc"

getBinDir, getLibDir, getDataDir, getLibexecDir, getSysconfDir :: IO FilePath
getBinDir = catchIO (getEnv "aptell_bindir") (\_ -> return bindir)
getLibDir = catchIO (getEnv "aptell_libdir") (\_ -> return libdir)
getDataDir = catchIO (getEnv "aptell_datadir") (\_ -> return datadir)
getLibexecDir = catchIO (getEnv "aptell_libexecdir") (\_ -> return libexecdir)
getSysconfDir = catchIO (getEnv "aptell_sysconfdir") (\_ -> return sysconfdir)

getDataFileName :: FilePath -> IO FilePath
getDataFileName name = do
  dir <- getDataDir
  return (dir ++ "/" ++ name)
