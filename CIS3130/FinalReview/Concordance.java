void main(){
    IO.println("Hello");
}

public class Concordance{
    Map<String, SequencedSet<Integer>> map = new HashMap<>();

    public Concordance(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
        int lineNum = 1;

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line);
            
            while (sc2.hasNext()){
                String word = sc2.next();
                map.put(word, map.getOrDefault(word, new TreeSet<Integer>()));
                map.get(word).add(lineNum);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (String s : map.keySet()){
            sb.append(s + ":");
            for(Integer num : map.get(s)){
                sb.append(" " + num);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
