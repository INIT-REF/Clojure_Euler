(defn euler002
  ([n] (euler002 n 1 2 0))
  ([limit, f1, f2, evensum]
   (if (> f2 limit)
     evensum
     (if (even? f2)
       (recur limit f2 (+ f2 f1) (+ evensum f2))
       (recur limit f2 (+ f2 f1) evensum)))))

(println (euler002 4000000))
