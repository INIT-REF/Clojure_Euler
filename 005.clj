(defn gcd [a, b] (if (= a 0) b (recur (rem b a) a)))

(defn lcm [a, b] (quot (* a b) (gcd a b)))

(defn euler005 [limit] (reduce lcm 1 (range 2 (inc limit))))

(println (euler005 20))
