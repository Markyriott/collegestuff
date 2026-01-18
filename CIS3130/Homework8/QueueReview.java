void main(){

}

<E> boolean contains(Queue3130<E> q, Object o){
    int size = q.size();
    boolean found = false;
    for(int i = 0; i < size; i++){
        E el = q.dequeue();
        q.enqueue(el);
        if (Objects.equals(el, o){
            found = true;
        }
    }
    return found;
}

<E> boolean equals(Queue3130<E> q, Queue3130<E> q2){
    if (q.size() != q2.size()){
        return false;
    }
    boolean res = true;
    for(int i = 0; i < q.size(); i++){
        E el1 = q.deqeue();
        E el2 = q.dequeue();

        if (!Objects.equals(el1,el2)){
            res = false;
        }

        q.enqueue(el1);
        q2.enqueue(el2);
    }
    return res;
}

<E> void mirror(Queue3130<E> q){
    Stack3130<E> s = new ArrayStack3130<>();

    for (int i = 0; i < q.size(); i++){
        E el = q.dequeue();
        s.push(el);
        q.enqueue(el);
    }

    while (!s.isEmpty()){
        q.enqueue(s.pop());
    }
}

<E> void twice(Queue3130<E> q){
    int size = q.size();

    for(int i = 0; i < size; i++){
        E el = q.dequeue();
        q.enqueue(el);
        q.enqueue(el);
    }
}
