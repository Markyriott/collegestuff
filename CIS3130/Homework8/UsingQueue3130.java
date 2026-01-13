void main(){
    IO.println("Hi");
}

public static <E> boolean contains(Queue3130<E> queue, Object o){
    boolean found = false;

    for (int i = 0; i < queue.size(); i++){
        E element = queue.dequeue();

        if (Objects.equals(element, o)){
            found = true;
        }
        queue.enqueue(element);
    }
    return found;
}

public static <E> boolean equals(Queue3130 q1, Queue3130 q2){
    if (q1.size() != q2.size()){
        return false;
    }

    boolean notEqual = false;

    for (int i = 0; i < q1.size(); i++){
        E el1 = q1.dequeue();
        E el2 = q2.dequeue();

        if (!Objects.equals(el1, el2)){
            notEqual = false;
        }
        q1.enqueue(el1);
        q2.enqueue(el2);
    }

    return notEqual;
}

public static <E> void mirror(Queue3130 q){
    Stack3130<E> stack = new ArrayStack3130<>();

    for(int i = 0; i < q.size(); i++){
        E el = q.dequeue();
        stack.push(el);
        q.enqueue(el);
    }
    while (!stack.isEmpty()){
        q.enqueue(stack.pop());
    }
}

public static <E> void twice(Queue3130 q){
    int size = q.size();
    for (int i = 0; i < size; i++){
        E el = q.dequeue();
        q.enqueue(el);
        q.enqueue(el);
    }
}
