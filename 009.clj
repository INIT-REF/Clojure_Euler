(defn per [[r s t]] (+ (+ r s) (+ r t) (+ r s t)))
(defn prod [[r s t]] (* (+ r s) (+ r t) (+ r s t)))

(defn euler009
  ([] (euler009 2 1))
  ([r d]
   (let [rs2 (quot (* r r) 2)]
     (if (> (* d d) rs2)
       (recur (+ r 2) 1)
       (let [rst [r d (quot rs2 d)]]
         (if (or (not= 1000 (per rst))
             (> (rem rs2 d) 0))
           (recur r (+ d 1))
           (prod rst)))))))

(println (euler009))
