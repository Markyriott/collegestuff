/* BST: 2, 4, 3, 1, 8, 5, 6, 7
                2
                / \
               1   4
                  / \
                 3   8
                    /
                   5
                    \
                     6
                      \
                       7

* BST: 14, 7, 16, 10, 17, 3, 5
                14
                / \
               7  16
              / \   \
             3  10  17
              \
               5

* BST: 30, 40, 24, 58, 48, 26, 11, 13
                 30
                /  \
              24   40
             /  \    \
            11  26   58
              \     /  
               13  48

*/

// biggestFamilly:
void biggestFamily(String filename)throws FileNotFoundException{
    Scanner sc = new Scanner(new File(filename));
    Map<String, Set<String>> map = new TreeMap<>();
    int max = 0;

    while(sc.hasNext()){
        String firstName = sc.next();
        String lastName = sc.next();

        if (!map.containsKey(lastName)){
            map.put(lastName, new TreeSet<>());
        }
        map.get(lastName).add(firstName);
        max = Math.max(max, map.get(lastName).size());
    }

    for(Map.Entry<String,Set<String>> entry: map.entrySet()){
        if (entry.getValue().size() == max){
            StringBuilder sb = new StringBuilder();

            sb.append(entry.getKey() + " family: ");
            for (String s : entry.getValue()){
                sb.append(s + " ");
            }
            System.out.println(sb.toString());
        }
    }
}

//friendList
TreeMap<String, TreeSet<String>> friendList(String filename) throws FileNotFoundException{
    Scanner sc = new Scanner(new File(filename));
    TreeMap<String, TreeSet<String>> map = new TreeMap<>();

    while (sc.hasNext()){
        String first = sc.next();
        String second = sc.next();

        if (!map.containsKey(first)){
            map.put(first, new TreeSet<String>());
        }

        if (!map.containsKey(second)){
            map.put(second, new TreeSet<String>());
        }

        map.get(first).add(second);
        map.get(second).add(first);
    }

    return map;
}

//Concordance
class Concordance{
    Map<String, Set<Integer>> map = new TreeMap<>();

    Concordance(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
        Integer lineNum = 1;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line);
            while (lineSc.hasNext()){
                String token = lineSc.next();
                if (!map.containsKey(token)){
                    map.put(token, new TreeSet<Integer>);
                }
                map.get(token).add(lineNum);
            }

            lineNum++;
        }
    }

    @Override
    String toString(){
        StringBuilder sb = new StringBuiler();

        for(Map.Entry<String, TreeSet<Integer>> entry : map.entrySet()){
            String token = entry.getKey();
            sb.append(token + ": ");

            Iterator iter = entry.getValue().iterator();
            while (iter.hasNext()){
                sb.append(iter.next());
                if(iter.hasNext()){
                    sb.append(", ");
                }
            }

            sb.append("\n")
        }

        return sb.toString();
    }

}
