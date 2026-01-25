
public class HashMultiset<E> implements Multiset<E>{
    private final Map<E, Integer> map = new HashMap<>();
    private int size = 0;

    @Override
    int size(){
        return size;
    }

    @Override
    void add(E element){
        map.put(element, map.getOrDefault(element, 0) + 1);
        size++;
    }

    @Override
    void add(E element, int occurences) throws IllegalArgumentException{
        if (occurences < 0) {
            throw new IllegalArgumentException();
        }
        if (occurences > 0){
            map.put(element, map.getOrDefault(element, 0) + occurences);
            size += occurences;
        }
    }
    
    @Override
    boolean contains(E element){
        return map.contains(element);
    }

    @Override
    int count(E element){
        if (contains(element)){
            return map.get(element);
        }
        return 0;
    }

    @Override
    boolean remove(E element){
        if (!contains(element)){
            return false;
        }

        if (map.get(element) - 1 == 0){
            map.remove(element);
        } else{
            map.put(element, map.get(element) - 1);
        }

        size--;
        return true;
    }

    @Override
    int removeAllOccurences(E element){
        int count = count(E);

        if(count > 0) {
            map.remove(element);
        }

        size -= count;
        return count;
    }

    @Override
    int remove(E element, int occurences) throws IllegalArgumentException{
        if (occurences < 0)
            throw new IllegalArgumentException();

        int count = count(element);

        if (count <= occurences){
            removeAllOccurences(element);
        } else {
            map.put(element, map.get(element) - occurences);
            size -= occurences;
        }

        return count;
    }

    @Override 
    String toString(){
        StringBuilder sb = new StringBuilder("[");


        for(Map.Entry<E, Integer> entry : map.entrySet()){
            sb.append(entry.getKey() " x " + entry.getValue());
        }

        return sb.append("]").toString();

    }

    @Override
    Iterator<E> iterator(){
        List<E> list = new ArrayList<>();

        for(Map.Entry<E, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            E element = entry.getKey();

            for(int i = 0; i < count; i++){
                list.add(element);
            }
        }
        return list.iterator();
    }

    @Override
    Set<E> elementSet(){
        return HashSet<E>(map.keySet());
    }

}
