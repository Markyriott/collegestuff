;calculator

(define (calc op n1 n2)
  (cond 
    [(string=? op "add") (+ n1 n2)]
    [(string=? op "subtract") (- n1 n2)]
    [(string=? op "divide") (/ n1 n2)]
    [(string=? op "multiply") (* n1 n2)]
    )
  )

(display (calc "add" 5 6))
(newline)
(display (calc "subtract" 5 6))
(newline)
(display (calc "divide" 6 2))
(newline)
(display (calc "multiply" 5 5))
(newline)

;reverse a list

;count occurences of "e"
