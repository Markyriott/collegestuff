class Stack3130Question{
    public <E> boolean contains(Stack3130<E> stack, Object o){
        Stack3130<E> aux = new ArrayStack3130<>();
        boolean res = false;

        while (!stack.isEmpty() && !res){
            E element = stack.pop();
            aux.push(element);

            if (Objects.equals(element, o)){
                res = true;
            }
        }

        while (!aux.isEmpty()){
            stack.push(aux.pop());
        }

        return res;
    }

    public static <E> boolean equals(Stack3130<E> stack1, Stack3130<E> stack2){
        Stack3130<E> aux = new ArrayStack3130<>();
        boolean res = false;

        while (!stack1.isEmpty() && !stack2.isEmpty() && !res){
            E element1 = stack1.pop();
            E element2 = stack2.pop();

            if (!Objects.equals(element1, element2)){ 
                res = true;
            }

            aux.push(element1);
            aux.push(element2);

        }

        boolean bothEmpty = stack1.isEmpty() && stack2.isEmpty();

        while (!aux.isEmpty()){
            stack2.push(aux.pop());
            stack1.push(aux.pop());
        }

        return bothEmpty && !res;
    }
}
