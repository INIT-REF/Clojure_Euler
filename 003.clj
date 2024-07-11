(defn lpf
  ([n] (lpf n 3))
  ([n, d]
   (if (= n 1)
     d
     (if (zero? (mod n d))
       (lpf (quot n d) d)
       (lpf n (+ d 2))))))

(println (lpf 600851475143))
