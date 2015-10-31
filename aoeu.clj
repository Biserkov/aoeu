(ns aoeu
  (:require [clojure.data.int-map :as i]
            [clojure.set :as s]))

(defn diff-equals? [set0 set1]
  (println (= (i/difference (i/int-set set0) 
                            (i/int-set set1))
              
              (s/difference set0 
                            set1))))

(diff-equals? #{180 360 871 2167} #{180})
(diff-equals? #{180 360 871 2167} #{180 360})
(diff-equals? #{180 360 871 2167} #{180 360 871})
(diff-equals? #{180 360 871 2167} #{180 360 2167})

(defn -main [])