;1. 4 function calculator
(define calc 
  (lambda (op n1 n2)
    (cond 
      ((string=? op "add") (+ n1 n2))
      ((string=? op "subtract") (- n1 n2))
      ((string=? op "divide") (/ n1 n2))
      ((string=? op "multiply") (* n1 n2))
      )
    )
  )

(display (calc "add" 5 6)) ; output: 11
(newline)
(display (calc "subtract" 5 6)) ; output: -1
(newline)
(display (calc "divide" 6 2)) ; output: 3
(newline)
(display (calc "multiply" 5 5)) ; output: 25
(newline)

; 2. reverse a list
(define reverse 
  (lambda (lst) 
    (if (equal? lst (list)) (list) 
      (append (reverse (cdr lst)) (list (car lst)))
      )
    )
  )

(display (reverse (list 1 2 3 4 5))) ; output: (5 4 3 2 1)
(newline)


; 3. count occurences of "e"
(define count
  (lambda (lst)
    (if (equal? lst (list)) 0
      (+ (if (equal? (car lst) "e") 1 0) (count(cdr lst)))
      )
    )
  )

(display (count (list "e" "e" "a" "e"))) ; output: 3
(newline)
(display (count (list "e" "e" "t" "s" "e" "f" "a" "e"))) ; output: 4
(newline)
