(ns practice.find-last-box)

;;Find the last box of a list

(defn find-last [nums] (last nums))

(println (find-last [1 2 3 4 5]))

(defn find-last-without-util [nums]
  (if (empty? (rest nums))
    (first nums)
    (find-last-without-util (rest nums))))

(def data [1 2 3 4 5 6 7 0])
(println "Last element in " data "is" (find-last-without-util data))

(def data [])
(println "Last element in " data "is" (find-last-without-util data))

(def data [1])
(println "Last element in " data "is" (find-last-without-util data))


(defn find-last-with-recur [nums]
  (if (empty? (rest nums))
    (first nums)
    (recur (rest nums))))

(def data [1 2 3 4 5 6 7 0])
(println "Last element in " data "is" (find-last-with-recur data))

(def data [])
(println "Last element in " data "is" (find-last-with-recur data))

(def data [1])
(println "Last element in " data "is" (find-last-with-recur data))
