(defn mult3or5 [x] (zero? (* (mod x 3) (mod x 5))))
(defn euler001 [x] (reduce + 0 (filter mult3or5 (range 1 x))))
(printf "%d" (euler001 1000))
