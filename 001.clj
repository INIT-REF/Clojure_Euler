(defn mult3or5 [x] (zero? (* (mod x 3) (mod x 5))))

(defn euler001 [x] (->> (range 1 x) (filter mult3or5) (reduce +)))

(printf "%d" (euler001 1000))
