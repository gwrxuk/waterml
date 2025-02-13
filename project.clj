(defproject waterml "0.1.0-SNAPSHOT"
  :description "Predict Water Level"
  :url "https://github.com/gwrxuk/"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/data.csv "1.0.0"]]
  :repl-options {:init-ns waterml.core}
  :main waterml.core)
