(ns loom.core
  (:gen-class)
  (:use [loom.io] :reload)
  (:use [loom.graph] :reload)
  (:use [loom.alg] :reload))  


(defn -main [& args]
  (println "Hello Loom!"))