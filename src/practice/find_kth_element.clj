(ns practice.find-kth-element)

(defn find-kth-element [nums k]
  (loop [nums nums, count 0]
    (if (= k count)
      (first nums)
      (recur (rest nums) (+ count 1)))))

(def data [3 5 9 17 23])
(println "1st element of " data "is " (find-kth-element data 0))

(def data [3 5 9 17 23])
(println "last element of " data "is " (find-kth-element data 4))

(def data [3 5 9 17 23])
(println "middle element of " data "is " (find-kth-element data 2))

(def data [])
(println "first element of " data "is " (find-kth-element data 0))

(def data [])
(println "third element of " data "is " (find-kth-element data 3))

(def data [1])
(println "first element " data "is " (find-kth-element data 0))
