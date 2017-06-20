(ns practice.reverse-list)

(defn reverse-list-with-vector [nums]
  (loop [in nums out []]
    (if (empty? in)
      out
      (recur (rest in) (cons (first in) out)))))

(println "reverse of list " [1 2 3 4] "is " (reverse-list-with-vector [1 2 3 4]))


(defn reverse-list [nums]
  (loop [in nums out '()]
    (if (empty? in)
      out
      (recur (rest in) (cons (first in) out)))))

(println "reverse of list " [1 2 3 4] "is " (reverse-list [1 2 3 4]))
