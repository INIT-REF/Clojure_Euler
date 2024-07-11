(def prods (for [a (range 100 1000), b (range 100 1000)] (* a b)))

(defn ispal
  ([n] (ispal n n 0))
  ([n, tmp, rev]
   (if (= 0 tmp)
     (= rev n)
     (recur n (quot tmp 10) (+ (rem tmp 10) (* rev 10))))))

(println (->> prods (filter ispal) (reduce max)))
