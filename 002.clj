(defn fibto
  ([n] (fibto '(2 1) n))
  ([x, n]
   (if (< (first x) n)
     (recur (cons (+ (first x) (first (rest x))) x) n)
     (rest x))))

(defn euler002 [x] (reduce + 0 (filter even? (fibto x))))

(println (euler002 4000000))
