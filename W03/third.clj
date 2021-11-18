
(defn gcd
  ([b] (gcd (bigint (rand-int (bigint b))) (bigint b)))
  ([a b]
  (if (zero? b)
  a
  (recur b (mod a b)))))



(defn testing[b]
  (loop [x 10]
    (when (>= x 1)
      ;; (println x)
      (println (gcd (bigint b)))
      (recur (- x 1)))))

  (defn gcd-instrumented [a b]
    (if (zero? b)
      a
      (do
       (println a '= b (list (quot a b)) '+ (rem a b))
       (recur b (mod a b)))))
