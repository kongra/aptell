#!/bin/bash

java -server -d64 \
     -Xshare:off -XX:+UseCompressedOops \
     -XX:+AggressiveOpts -XX:+DoEscapeAnalysis \
     -Xms128M -Xmx4G -XX:+UseParallelGC -XX:+UseParallelOldGC \
     -classpath lib/antlr-4.7-complete.jar:lib/aptell.jar \
     aptell.antlr4.JavaProcessor $1 $2

# Running
# bin/process-java.sh srcDir targetDir
