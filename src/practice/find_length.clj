(ns practice.find-length)


(defn find-length [nums]
  (loop [nums nums count 0]
    (if (empty? (rest nums))
      count
      (recur (rest nums) (+ count 1)))))

(println "Length of list " [1 2 3 4 5 6] "is " (find-length [1 2 3 4 5 6]))
(println "Length of list " [6] "is " (find-length [6]))
(println "Length of list " [] "is " (find-length []))

