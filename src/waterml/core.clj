(ns waterml.core 
  (:require [clojure.data.csv :as csv]
            [clojure.java.io :as io])
  (:gen-class))

(defn read-csv [file-path]
  (with-open [reader (io/reader file-path)]
    (doall
      (csv/read-csv reader))))

(defn -main
  [& args]
    (let [file-path "data/waterlevel.csv"
        data (read-csv file-path)]
    (println data))
  (println "Predict Water Level"))
