(defn sieve [limit] (into [] (map #(< 1 %) (range 0 (inc limit)))))

(defn SoE
  ([limit] (SoE limit (sieve limit) 2 4))
  ([limit, s, d, m]
   (if (> (* d d) limit)
     s
     (if (or (> m limit) (not (nth s d)))
       (recur limit s (inc d) (* (inc d) (inc d)))
       (recur limit (assoc s m false) d (+ m d))))))

(defn primes [limit] (->> (range 0 (inc limit)) (map #(if %1 %2) (SoE limit)) (remove nil?)))

(println (nth (primes 114500) 10000))
