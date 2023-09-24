(defproject clojtape "0.1.0-SNAPSHOT"
  :description "a Clojure Turing Machine"
  :url "https://github.com/Izder456/clojtape"
  :license {:name "WTFPL (modified)"
            :url "https://www.wtfpl.net"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot clojtape.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       }})