;; Copyright (c) Konrad Grzanek
;; Created 2018-01-06
(defproject kongra/aptell "0.1.0-SNAPSHOT"
  :description "Toolkit for Programs Analysis"
  :url         "http://github.com/kongra/aptell"
  :license     {:name "Eclipse Public License"
                :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure      "1.9.0"]
                 [org.clojure/core.async "0.4.474"]

                 [com.taoensso/timbre     "4.10.0"]
                 [primitive-math           "0.1.6"]
                 [org.antlr/antlr4         "4.7.1"]

                 [kongra/prelude          "0.1.10"]
                 [kongra/ch                "0.1.8"]]

  :profiles     {:repl {:plugins      [[lein-nodisassemble       "0.1.3"]
                                       [cider/cider-nrepl       "0.17.0"]]
                        :dependencies [[org.clojure/tools.nrepl "0.2.13"]]}}
  :aot          :all

  :source-paths      ["src/clj" "test"]
  :java-source-paths ["src/java"]
  :test-paths        ["test"]

  :global-vars  {*warn-on-reflection* true
                 *assert*             true
                 *print-length*       500}

  :pedantic? :warn

  :jvm-opts ^:replace ["-server"
                       "-Dclojure.compiler.direct-linking=true"

                       "-Xshare:off"
                       "-XX:+AggressiveOpts"
                       "-XX:+DoEscapeAnalysis"
                       "-XX:+UseCompressedOops"
                       ;; "-XX:+UseNUMA" ;; to check: numactl --hardware

                       "-Xms4G"
                       "-Xmx4G"

                       ;; "-XX:+UseParallelGC"
                       ;; "-XX:+UseParallelOldGC"
                       ;; "-XX:-UseAdaptiveSizePolicy"
                       ;; "-XX:NewSize=400m"
                       ;; "-XX:MaxNewSize=400m"
                       ;; "-XX:SurvivorRatio=6"

                       "-Xlog:gc*"
                       ])
