(defproject common.web-clj "1.0.0-SNAPSHOT"
  :description "common used for http web"
  :url ""
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [common-clj "1.0.0-SNAPSHOT"]
                 [buddy "0.2.0b2"]
                 [javax.servlet/servlet-api "2.5"]
                 [amalloy/ring-gzip-middleware "0.1.3"]
                 [ring/ring-core "1.3.1" :exclusions [org.clojure/tools.reader]]
                 [ring/ring-devel "1.3.1"]
                 [compojure "1.1.9"]
                 [http-kit "2.1.19"]]
  :exclusions [org.clojure/clojure])
