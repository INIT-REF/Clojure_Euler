(defn per [r s t] (+ (+ r s) (+ r t) (+ r s t)))
(defn prod [r s t] (* (+ r s) (+ r t) (+ r s t)))
(defn rs2 [r] (quot (* r r) 2))

(defn euler009
  ([] (euler009 2 1))
  ([r d]
   (if (> (* d d) (rs2 r))
     (recur (+ r 2) 1)
     (if (or (not= 1000 (per r d (quot (rs2 r) d)))
             (> (rem (rs2 r) d) 0))
     (recur r (+ d 1))
     (prod r d (quot (rs2 r) d))))))

(println (euler009))
