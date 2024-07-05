(ns waterml.core 
  (:require [clojure.data.csv :as csv]
            [clojure.java.io :as io])
  (:gen-class))

(defn read-csv [file-path]
  (with-open [reader (io/reader file-path)]
    (doall
      (csv/read-csv reader))))

(defn read-csv-row-by-row [file-path]
  (with-open [reader (io/reader file-path)]
    (let [csv-data (csv/read-csv reader)]
      (doseq [row csv-data]
        (println row)))))


(defn -main
  [& args]
  (let [file-path "data/waterlevel.csv"
        data (read-csv file-path)
        do (read-csv-row-by-row file-path)
        ]
    (println data))
  (println "Predict Water Level"))
