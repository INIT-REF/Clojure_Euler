(defn fib
  ([n] (fib '(2 1) n))
  ([x, n]
   (if (< (first x) n)
     (fib (cons (+ (first x) (first (rest x))) x) n)
     (rest x))))

(defn euler002 [x] (reduce + 0 (filter even? (fib x))))

(println (euler002 4000000))
