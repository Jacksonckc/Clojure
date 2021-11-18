;; Take 2 inputs and finds the greastest common denominator for a and b.
(defn gcd-instrumented [a b]
    (if (zero? b)
      a
      (do
       (println a '= b (list (quot a b)) '+ (rem a b))
       (recur b (mod a b)))))
       

       
;; Takes only 1 input, generates a random number which is smaller than the input,
;; then finds the gcd for those two numbers.
(defn gcd
  ([b] (gcd (bigint 
  (rand b)) 
  (bigint b)))
  ([a b]
  (if (zero? b)
  a
  (recur b (mod a b)))))



;; This function receives one input and use the input to call gcd function,
;; loop through the gcd function 20 times to ensure a number is being tested many times to avoid inaccuracy.
(defn prime_pretender_test[b]
  (loop [x 20]
    (when (>= x 1)
      ;; (println x)
      (println (gcd (bigint b)))
      (recur (- x 1)))))
