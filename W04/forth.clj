;; generate combinations from 2 lists/vectors
(defn cartesian-product
      ([] '(()))
      ([xs & more]
        (mapcat #(map (partial cons %)
                      (apply cartesian-product more))
                xs)))

;; create 2 lists
(def flavors01 ["Vanilla" "Chocolate" "Cherry-Ripple"])

(def flavors02 ["Lemon" "Butterscotch" "Licorice-Ripple"])

;; combining 2 lists
(def all-flavors (concat flavors01 flavors02))

;; This function will print 2 lists
(defn -main []
  (println "Two Lists Results: ")
  (println
    ;; Creates a new list, which contains more lists inside with the first item in the sub lists being chocolate.
    (filter
      (fn [x] (= (first x) "Chocolate")) ; The 1 for the parameter number indicator (%) is not needed since there is only one parameter.
      (cartesian-product flavors01 flavors02)))
  (newline)
  (println "Single List Results: ")
  (println
    ;; Creates a new list, which contains more lists inside with the first or the second item in the sub lists being chocolate.
    (filter
      #(or (= (first %) "Chocolate") (= (last %) "Chocolate"))
    (cartesian-product all-flavors all-flavors))))

(-main)
