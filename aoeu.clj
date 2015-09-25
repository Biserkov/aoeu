(ns aoeu
  (:require [clojure.data.int-map :as s]))

(let [a [1 139]
      set0 (s/int-set a)
      set1 (s/int-set [0])
      set2 (s/difference set0 (s/int-set a))]
  (s/union set1 set2))