(defn fibto
  ([n] (fibto '(2 1) n))
  ([x, n]
   (if (< (first x) n)
     (recur (cons (+ (first x) (first (rest x))) x) n)
     (rest x))))

(defn euler002 [x] (->> (fibto x) (filter even?) (reduce +)))

(println (euler002 4000000))
