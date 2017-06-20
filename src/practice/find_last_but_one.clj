(ns practice.find-last-but-one)


(defn find-last-but-one [nums]
  (if (empty? (rest (rest nums)))
    (first nums)
    (find-last-but-one (rest nums))))

(def data [3 5 9 17 23])
(println "Last but one of " data "is " (find-last-but-one data))



(defn find-last-but-one-recur [nums]
  (if (empty? (rest (rest nums)))
    (first nums)
    (recur (rest nums))))

(defn find-last-but-one-recur [nums]
  (if (empty? (rest nums))
    nil
    (if (empty? (rest (rest nums)))
      (first nums)
      (recur (rest nums)))))

  (def data [3 5 9 17 23])
  (println "Last but one of " data "is " (find-last-but-one-recur data))

  (def data [])
  (println "Last but one of " data "is " (find-last-but-one-recur data))

  (def data [1])
  (println "Last but one of " data "is " (find-last-but-one-recur data))
