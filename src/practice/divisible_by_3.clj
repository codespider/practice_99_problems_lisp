(ns practice.divisible-by-3)


(defn div_by_3? [num] (= (mod num 3) 0))

(println (div_by_3? 3))
(println (div_by_3? 4))
(println (div_by_3? 5))
(println (div_by_3? 6))


