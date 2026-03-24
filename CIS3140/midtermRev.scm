(define trim 
  (lambda (n xlist) 
    (if (= n 0) xlist (trim (- n 1) (cdr xlist))
    )
  )
)

(display (trim 2 (list 5 4 3 2 1)))
