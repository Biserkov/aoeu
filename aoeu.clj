(ns aoeu
  (:require [clojure.data.int-map :as s]))

(def a [1 139])
(def set0 (s/int-set a))
(def set1 (s/int-set [0]))
(def set2 (s/difference set0 (s/int-set a)))
  
(s/union set1 set2)

(defn -main []
  (println "I compiled successfully"))