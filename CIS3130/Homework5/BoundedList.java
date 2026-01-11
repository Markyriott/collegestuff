import java.util.Objects;

/**
 * A capacity-bounded list of String elements. Each list has a capacity, which is the maximum number of elements that the list can hold at one time. 
 * Each list also has a size, which is the number of elements currently held by the list. The elements of a list have indexes: the first element 
 * is at index 0, the second element is at index 1, and so on. Null elements are allowed.
 */
public interface BoundedList<E> {
    /**
     * Returns the maximum number of elements that this list can hold at the same time.
     * @return the capacity
     */
    int capacity();

    /**
     * Returns the number of elements currently held in this list.
     * @return the size, which is less than or equal to the capacity
     */
    int size();

    /**
     * Adds the specified element to the end of this list, if the list isn't already full. 
     * For example, if {@code list} is a StringBoundedList with capacity 10 that represents {@code [a, b, c]}, 
     * then saying {@code list.add("d")} makes {@code list} represent {@code [a, b, c, d]}.
     * @param s the String to add
     * @throws IllegalStateException if this list is already full
     */
    void add(E e);

    /**
     * Returns the element at the specified index in this list.
     * @param index the position of the desired element.
     * @return the element (possibly null) at the specified position
     * @throws IndexOutOfBoundsException if index is negative, or greater than or equal to the size
     */
    E get(int index);

    /**
     * Replaces the old element at the specified index with the new element, and returns the old element.
     * @param index the index where an element should be replaced
     * @param element the new element
     * @return the old element
     * @throws IndexOutOfBoundsException if index is negative, or greater than or equal to the size
     */
    E set(int index, E element);

    /**
     * Return the index of the first occurrence of the specified String in this list, or -1 if it doesn't occur in this list.
     * @param s the String to search for (possibly null)
     * @return the index of the first occurrence of s, or -1 if not found
     */
    int indexOf(E e);

    /**
     * Return the index of the last occurrence of the specified String in this list, or -1 if it doesn't occur in this list.
     * @param s the String to search for (possibly null)
     * @return the index of the last occurrence of s, or -1 if not found
     */
    int lastIndexOf(E e);

    /**
     * Makes the list empty.
     */
    void clear();

    default boolean isEmpty(){
        return size() == 0;
    }

    default boolean isFull(){
        return size() == capacity();
    }

    default E getFirst(){
        return get(0);
    }

    default E getLast(){
        return get(size() - 1);
    }

    default E setFirst(E element){
        return set(0, element); 
    }

    default E setLast(E element){
        return set(size() - 1, element); 
    }

    default boolean contains(E e){
        return indexOf(e) >= 0;
    }
}

public class ArrayBoundedList<E> implements BoundedList<E>{
    private E[] arr;
    private int size = 0;

    public ArrayBoundedList(int capacity){
        if (capacity < 0){throw new IllegalArgumentException("Capacity is negative");}
        arr = (E[]) Object[capacity];
    }

    @Override
    public int capacity(){
        return arr.length;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){
        if (capacity() == size){throw new IllegalStateException("List is full");}
        arr[size++] = e;
    }

    @Override
    public E get(int index){
        if (index >= size || index < 0){throw new IndexOutOfBoundsException("Index out of bounds");}
        return arr[index];
    }

    @Override
    public E set(int index, E element){
        if (index >= size || index < 0){throw new IndexOutOfBoundsException("Index out of bounds");}
        arr[size] = arr[index];
        arr[index] = element;
        return arr[size];
    }

    @Override
    public int indexOf(E e){
        for (int i = 0; i < size; i++){
            if (Objects.equals(arr[i], e)){return i;}
        }
        return - 1;
    }

    @Override
    public int lastIndexOf(E e){
        for (int i = size - 1; i >= 0; i--){
            if (Objects.equals(arr[i], e)){return i;}
        }
        return - 1;
    }

    @Override
    public void clear(){
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++){
            sb.append(arr[i]);

            if (i < size - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }

    public String toReverseString(){
        StringBuilder sb = new StringBuilder("[");

        for (int i = size - 1; i >= 0; i--){
            sb.append(arr[i]);
            if (i > 0) sb.append(", ");
        } 
        return sb.append("]").toString();
    }
    public int count(Object o){
        int count = 0;
        for(int i = 0; i < size; i++){
            if (Objects.equals(arr[i], o)){
                count++;
            }
        }
        return count;
    }
}

//Capacity vs Size:
//1. capacity: 0, size: 0
//2. capacity: 1, size: 0
//3. capacity: 3, size: 2
//4. capacity: 2, size: 2   
//5. capacity: 1, size: 1
//

static int count(E[] arr, E element){
    int count = 0;
    for (E e : arr){
        if (Objects.equals(e, element)){
            count++;
        }
    }

    return count;
}

static <E extends Number> double average(List<E> list){
    if (list.isEmpty()){throw new IllegalArgumentException();}
    double res = 0;
    for(E num : list){
        res += num.doubleValue();
    }
    return res / list.size();
}

static <E extends Comparable<E>> boolean isSorted(E[] arr){
    if (arr.length <= 1) return true;

    for (int i = 0; i < arr.length - 1; i++){
        if (arr[i].compareTo(arr[i+1] > 0) return false;
    }

    return true;
}

static <E extends Comparable<E>> void sort(E[] arr){
    for (int i = 0; i < arr.length - 1; i++){
        E min = i;
        for (int j = i + 1; j < arr.length; j++){
            if (arr[j].compareTo(arr[min]) <= 0){
                min = j;
            }
        } 

        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
