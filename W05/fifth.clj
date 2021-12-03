;; This function will decode a compressed number list that's being sent in.
(defn decoder
    ;; Receives one list, set the starting number to 2(since this is the first prime numner), set accumulator to nil (nothing in a list)
  ([list] (decoder list 2 [nil]))
    ;; Apply the initialized parameters here in this function
  ([list counter accumulator] 
    ;; Initialize 3 variables, firstItem, incr, and a list.
   (let [firstItem (first list) ;;firstItem is the first element in the passed in list
         incr (if (= firstItem 0) 1 firstItem) ;;incr will change according to the element, it vary from 1 to n (This ensures that the counter will continue going up)
         prepended-accumulator 
         (if (= firstItem 1) ; when the first element of the list is 1
           (conj accumulator counter) ;; Because accumulator is a list, conj will prepend the second argument
            accumulator)] ;; If the first element of the list is not 1, which will be 0, then we don't want this item to be in the prime number list since this is not a prime.
 
     (if (empty? (rest list)) ; if the rest of the list is empty (rest function will return all items in a list except the first one)
        prepended-accumulator ; the list was prepended, so reverse the list to get the right order and return the result
       (recur (rest list) (+ incr counter) prepended-accumulator))))) ; otherwise, call decode-prime-list again

;; This function will print the decoded number list
(defn decoded-number-list []
  (def rleprimes '(1 1 0 1 0 1 3 1 0 1 3 1 0 1 3 1 5 1 0 1 5 1 3 1 0 1 3 1 5 1 5 1 0 1 5 1 3 1 0 1 5 1 3 1 5 1 7 1 3))
  (println rleprimes)
  (println (decoder rleprimes)))
