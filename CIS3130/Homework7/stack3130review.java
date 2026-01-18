void main(){

}

public <E> boolean contains(Stack3130<E> s, Object o){
    Stack3130<E> s2 = new ArrayStack<>();
    boolean found = false;

    while (!s.isEmpty() && !found){
        E el = s.pop();
        if (Objects.equals(el, o)){
            found = true;
        }
        s2.push(el);
    }
    while (!s2.isEmpty()){
        s.push(s2.pop());
    }

    return found;
}

public <E> boolean equals(Stack3130 s, Stack3130 s2){
    Stack3130<E> s3 = new ArrayStack3130<>();
    boolean res = true;

    while (!s.isEmpty() && !s2.isEmpty() && res){
        E e1 = s.pop();
        E e2 = s.pop();
        if (!Objects.equals(e1,e2)){
            res = false;
        }
        s3.push(e1);
        s3.push(e2);
    }
    if (!s.isEmpty() || !s2.isEmpty()){res = false;}
    while (!s3.isEmpty()){
        s2.push(s3.pop());
        s.push(s3.pop());
    }
    return res;
}
