  (defn gcd-instrumented 
  ([b] (gcd-instrumented (bigint (rand b)) (bigint b)))
  ([a b]
    (if (zero? b)
      a
      (do
       (println a '= b (list (quot a b)) '+ (rem a b))
       (recur b (mod a b))))))
       

(defn gcd
  ([b] (gcd (bigint 
  (rand b)) 
  (bigint b)))
  ([a b]
  (if (zero? b)
  a
  (recur b (mod a b)))))




(defn prime_pretender_test[b]
  (loop [x 20]
    (when (>= x 1)
      ;; (println x)
      (println (gcd (bigint b)))
      (recur (- x 1)))))
