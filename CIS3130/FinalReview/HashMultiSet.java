import java.util.Iterator;
import java.util.Set;

interface Multiset<E> extends Iterable<E> {
    /**
     * Returns the number of elements in this multiset. Each occurrence of an element
     * is counted separately. For example, if multiset m contains three occurrences of
     * "cat", one of "bird", and two of "dog", then m.size() should return 6.
     */
    int size();

    /**
     * Adds one occurrence of the specified element into this multiset.
     */
    void add(E element);

    /**
     * Adds a number of occurrences of an element to this multiset. Note that if
     * occurrences == 1, this method has the identical effect to add(element).
     * @throws IllegalArgumentException if occurrences is negative
     */
    void add(E element, int occurrences) throws IllegalArgumentException;

    /**
     * Determines whether this multiset contains at least one occurrence of the
     * specified element. 
     */
    boolean contains(E element);

    /**
     * Returns the number of occurrences of the specified element in this multiset,
     * possibly zero (but never negative).
     */
    int count(E element);

    /**
     * Removes a single occurrence of the specified element from this multiset, if
     * present. Returns true if an occurrence was found and removed, otherwise false.
     */
    boolean remove(E element);

    /**
     * Removes all occurrences of the specified element from this multiset
     * @return the count of the element before the operation; possibly zero
     */
    int removeAllOccurrences(E element);

    /**
     * Removes a number of occurrences of the specified element from this multiset. If
     * the multiset contains fewer than this number of occurrences to begin with, all
     * occurrences will be removed. Note that if occurrences == 1, this is functionally
     * equivalent to the call remove(element).
     * @return the count of the element before the operation; possibly zero
     * @throws IllegalArgumentException if occurrences is negative
     */
    int remove(E element, int occurrences) throws IllegalArgumentException;

    /**
     * Returns a string representation of this multiset. The String should contain all
     * unique elements along with their counts. For example, if multiset m contains
     * three occurrences of "cat", one of "bird", and two of "dog", then m.toString()
     * should return something like "[cat x 3, bird x 1, dog x 2]", though the order
     * may differ.
     */
    @Override
    String toString();

    /**
     * Returns an iterator over the elements in this multiset. There are no guarantees
     * concerning the order in which the elements are returned. Elements that occur
     * multiple times in the multiset will appear multiple times when iterating using
     * this iterator. For example, if the multiset contains three occurrences of "cat", 
     * one of "bird", and two of "dog", then the iterator would provide the following 
     * elements, in any order: "cat", "cat", "cat", "bird", "dog", "dog".
     */
    @Override
    Iterator<E> iterator();

    /**
     * Returns a set view of the distinct elements contained in this multiset. For example, 
     * if the multiset contains three occurrences of "cat", one of "bird", and two of "dog",
     * then the set would contain the following three elements, in any order: "cat", "bird",
     * "dog".
     */
    Set<E> elementSet();
}

public class HashMultiSet<E>{
    private final Map<E, Integer> map = new HashMap<>();
    private int size = 0;

    public int size(){
        return size;
    }

    public void add(E element){
        add(element, 1);
    }

    public void add(E element, int occurences) throws IllegalArgumentException{
        if (occurences < 0){
            throw new IllegalArgumentException();
        }
        map.put(element, map.getOrDefault(element, 0) + occurences);
        size += occurences;
    }

    public boolean contains(E element){
        return map.containsKey(element);
    }

    public int count(E element){
        if(!contains(element)){
            return 0;
        }
        return map.get(element);
    }

    public boolean remove(E element){
        if (!contains(element)){
            return false;
        }
        
        if (map.get(element) == 1){
            map.remove(element);
        } else {
            map.put(element, map.get(element) - 1);
        }

        size--;
        return true;
    }

    public int removeAllOccurences(E element){
        if (!contains(element)){
            return 0;
        }
        int res = map.get(element);

        map.remove(element);

        size -= res;

        return res;
    }

    public int remove(E element, int occurences) throws IllegalArgumentException{
        if (occurences < 0) throw new IllegalArgumentException();
        if (!contains(element)) return 0;

        int res = map.get(element);
        
        if (res < occurences) return removeAllOccurences(element);
        
        map.put(element, map.get(element) - occurences);

        size -= occurences;

        return res;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        
        Iterator iter = map.keySet().iterator();
        while(iter.hasNext()){
            E entry = iter.next();
            sb.append(entry + " x " + map.get(entry));

            if(iter.hasNext()){
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }

    public Iterator<E> iterator(){
        List<E> list = new ArrayList<>();
        
        for (E element : map.keySet()){
            for (int i = 1; i < map.get(element); i++){
                list.add(element);
            }
        }

        return list.iterator();
    }

    public Set<E> elementSet(){
        return map.keySet();
    }
}

void main(){
    IO.println("Hello");
}
