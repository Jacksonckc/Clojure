;; this project will help to calculate the tax you need to pay to the goverment.

;; The following defs are the different tax rate for different income ranges.
(def tax_rate_01 0.1)

(def tax_rate_02 0.12)

(def tax_rate_03 0.22)

(def tax_rate_04 0.24)

(def tax_rate_05 0.32)

(def tax_rate_06 0.35)

(def tax_rate_07 0.37)

;; A function will calculate the salary suing one parameter salary and all the tax_rates.
(defn calculate_tax [salary]
    ;; Senario when income is lower than 9951
    (if (< salary 9951)
    (* salary tax_rate_01)
    ;; Senario when income is  not lower than 9951 but lower than 40526
    (if (< salary 40526)
        (+ 995 (* (- salary 9950) tax_rate_02))
        ;; Senario when income is  not lower than 40526 but lower than 86376
        (if (< salary 86376)
            (+ 4664 (* (- salary 40525) tax_rate_03))
            ;; Senario when income is  not lower than 86376 but lower than 164926
            (if (< salary 164926)
                (+ 14751 (* (- salary 86375) tax_rate_04))
                ;; Senario when income is  not lower than 164926 but lower than 209426
                (if (< salary 209426)
                    (+ 33603 (* (- salary 164925) tax_rate_05))
                    ;; Senario when income is  not lower than 209426 but lower than 523601
                    (if (< salary 523601)
                        (+ 47843 (* (- salary 209425) tax_rate_06))
                        ;; Senario when the income is not lower than 523601
                        (if (> salary 523600)
                            (+ 157804.25 (* (- salary 523600) tax_rate_07))))))))))