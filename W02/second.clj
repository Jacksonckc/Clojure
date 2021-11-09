(defn fact[x]
  (if (<= x 1) 1 (* x  (fact (- x 1))  )))

(def phrase "Facetiously speaking, what is special about May the fourth?")

(def n (count phrase))

(def n! (fact (bigint n)))

(def k 3)

(defn countCombinations[] (/ n! (fact (bigint(- n k)))))