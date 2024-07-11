(defn euler006 [x]
  (-
   (->> (range 1 (inc x)) (reduce +) (#(* % %)))
   (->> (range 1 (inc x)) (map #(* % %)) (reduce +))))

(println (euler006 100))
