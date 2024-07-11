(defn gcd [a, b] (if (= a 0) b (recur (rem b a) a)))
