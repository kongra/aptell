#!/bin/sh

stack exec hlint `find src/hs/  -name "*.hs"`
