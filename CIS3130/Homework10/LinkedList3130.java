void main(){
    IO.println("Hello");
}

// TODO for homework
// Required representation: chain of doubly-linked nodes.
// The fields should be: a head pointer, a tail pointer, and an int size.
// Required method running times:
// - isEmpty, size, addFirst, addLast, getFirst, getLast, removeFirst, removeLast: O(1)
// - add, remove, get, set: O(n), but performing at most n/2 "hops" (i.e. going from node
//   to node.next, or from node to node.previous)
// - indexOf, lastIndexOf, toString: O(n)
// - iterator: O(1).
public class LinkedList3130<E> implements Deque3130<E>, List3130<E> {
    private static class Node<E> {
        Node<E> previous;
        E data;
        Node<E> next;

        Node(E data) {
            this(null, data, null);
        }

        Node(Node<E> previous, E data, Node<E> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    @Override
    public int size() {
        return size;
    }

    // deque methods

    @Override
    public void addFirst(E e) {
        Node<E> node = new Node<>(e);

        if (isEmpty()){
            head = tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> node = new Node<>(e);

        if (isEmpty()){
            head = tail = node;
        } else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public E getFirst() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        return head.data;
    }

    @Override
    public E getLast() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        E temp = head.data;
        head = head.next;
        head.previous = null;
        size--;
        return temp;
    }

    @Override
    public E removeLast() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        E temp = tail.data;
        tail = tail.previous;
        tail.next = null;
        size--;
        return temp;
    }

    // list methods

    @Override
    public void add(int index, E element) {
        if (isEmpty() || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }

        Node<E> node = new Node<>(current.previous, element, current);
        current.previous.next = node;
        current.previous = node;
        size++;
    }

    @Override
    public E remove(int index) {
        if (isEmpty() || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
        return current.data;
    }

    @Override
    public E get(int index) {
        if (isEmpty() || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = head; 
        for(int i = 0; i< index; i++){
            current = current.next;
        }

        return current.data;
    }

    @Override
    public E set(int index, E element) {
        if (isEmpty() || index >= size){
            throw new IndexOutOfBoundsException();
        }
        
        Node<E> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }

        E result = current.data;
        current.data = element;
        return result;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node<E> current = head;
        while (current != null ){
            if (Objects.equals(current.data, o)){
                return index; 
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        Node<E> current = tail;
        while (current != null){
            if (Objects.equals(current.data, o)){
                return index;
            }
            current = current.previous;
            index--;
        }

        return index;
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>(){
            private Node<E> current;

            @Override
            public boolean hasNext(){
                return current.next != null;
            }

            @Override
            public E next(){
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                E res = current.data;
                current = current.next;
                return res;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        Node<E> current = head;
        while (current != null){
            sb.append(current.data);
            
            if (current.next != null){
                sb.append(", ");
            }
            current = current.next;
        }
        return sb.append("]").toString();
    }
}

//List running time:
//ArrayList:
// 1. O(n^2)
// 2. O(n^2)
// 3. O(n^3)
// 4. O(n^2)
// 5. O(n)
// 6. O(n)
// 7. O(n^2)
//
// LinkedList:
// 1. O(n)
// 2. O(n)
// 3. O(n^2)
// 4. O(n)
// 5. O(n)
// 6. O(n)
// 7. O(n^2)

//Using Iterators:
void removeEvenLength(Collection<String> c){
    Iterator<String> iter = c.iterator();

    while (iter.hasNext()){
        if(iter.next().length() % 2 == 0){
            iter.remove();
        }
    }
}

SequencedCollection<Integer> removeAndReturnsEven(SequencedCollection<Integer> coll){
    List<Integer> list = new ArrayList<>();

    Iterator<Integer> iter = coll.iterator();

    while(iter.hasNext()){
        int element = iter.next();
        if(element % 2 == 0){
            iter.remove();
            list.add(element);
        }
    }
    return list;

}

<E> void removeEveryOccurence(Collection<E> coll, Object o){
    Iterator<E> iter = coll.iterator();

    while(iter.hasNext()){
        if(Objects.equals(iter.next(), o)){
            iter.remove();
        }
    }
}

<E> void removeDuplicatesFromSorted(SequencedCollection<E> coll){
    Iterator<E> iter = coll.iterator();

    E prev = iter.next();
    while(iter.hasNext()){
        E curr = iter.next();
        if(Objects.equals(prev, curr)){
            iter.remove();
        }
        prev = curr;
    }
}

<E extends Comparable<E>> E max(Collection<E> coll){
    if (coll.isEmpty()){
        throw new IllegalArgumentException("collection empty");
    }
    E max = coll.get(0);

    Iterator<E> iter = coll.iterator();

    while (iter.hasNext()){
        E element = iter.next();
        if (element.compareTo(max) > 0){
            max = element;
        }
    }

    return max;
}
e
//Range: 
class Range implements Iterable<Integer>{
    private final int start;
    private final int stop;
    private final int step;

    Range(int stop){
        Range(0, stop);
    }
    Range(int start, int stop){
        Range(start, stop, 1);
    }
    Range(int start, int stop, int step){
        if (start > stop || step == 0){
            throw new IllegalArgumentException();
        }

        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    @Override
    Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            int current = start;

            @Override
            boolean hasNext(){
                return current < stop;
            }

            @Override
            Integer next(){
                if (hasNext()){
                    int res = current;
                    current += step;
                    return res;
                } else{
                    throw new NoSuchElementException();
                }
            }
        }
    }
}
