(defn lpf
  ([n] (lpf n 3))
  ([n, d]
   (if (= n 1)
     d
     (if (zero? (mod n d))
       (recur (quot n d) d)
       (recur n (+ d 2))))))

(println (lpf 600851475143))
