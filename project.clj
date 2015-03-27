(defproject api-template "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]

                 [http-kit "2.1.19"]
                 [metosin/compojure-api "0.18.0"]
                 [metosin/ring-http-response "0.6.0"]
                 [metosin/ring-swagger-ui "2.0.24"]
                 [ring/ring-defaults "0.1.4"]

                 [com.stuartsierra/component "0.2.3"]]

  :source-paths ["src"]
  :test-paths ["test"]
  :resource-paths ["resources"]

  :main sample.main

  :profiles {:dev
             {:source-paths ["dev-src"]
              :dependencies [[midje "1.7.0-SNAPSHOT"]
                             [org.clojure/tools.namespace "0.2.10"]
                             [reloaded.repl "0.1.0"]]
              :plugins [[lein-midje "3.1.3"]]
              :repl-options {:init-ns user}}

             :uberjar
             {:aot [sample.main]
              :uberjar-name "sample.jar"}})