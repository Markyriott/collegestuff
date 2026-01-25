import java.util.Random;
import java.util.List;
import java.util.ArrayList;

interface GrabBag<E>{
    void insert(E item);
    E sample();
    E remove();
}

public class BagList<E> implements GrabBag<E>{
    private List<E> bag = new ArrayList<>();
    private Random rand = new Random();

    @Override
    public void insert(E item){
        bag.add(item);
    }

    public E sample(){
        return bag.get(rand.nextInt(bag.size()));
    }

    public E remove(){
        int randIndex = rand.nextInt(bag.size());
        E res = bag.get(randIndex);
        bag.set(randIndex, bag.removeLast());
        return res;
    }
}

void main(){
    IO.println("Hello");
}
