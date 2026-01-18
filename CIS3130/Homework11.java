/* Tracing Chaining Hashset:
 Point A: [null, null, null, |, null, null] Load Factor: 2/6
                             |
                            \/
                           -15
                            |
                           \/
                           15

 Point B: [null, | , | , null, null, null, null, null, null, null, null, null, null] Load Factor: 3/13
                 |   |
                \/  \/
                27 -15
                    |
                   \/
                   15
 Point C: [null, | , | , null, null, null, null, null, null, | , null, null, null] Load Factor: 4/13
                 |   |                                       |
                \/  \/                                      \/
                27 -15                                     100
                    |
                   \/
                   15
 Point D: [null, | , | , null, null, null, null, null, null, | , null, null, null] Load Factor: 3/13
                 |   |                                       |
                \/  \/                                      \/
                27 -15                                     100
 Point D: [null, | , | , null, null, null, null, null, null, | , null, null, null] Load Factor: 4/13
                 |   |                                       |
                \/  \/                                      \/
                27 -15                                     100
                    |
                   \/
                   15
*/

// Writing Code with Hashset:
// maxLength: 
int maxLength(Set<String> set){
    int max = 0;

    for (String str : set){
        max = str.length() > max ? str.length() : max;
    }

    return max;
}

//numUniqueValues:
int numUniqueValues(List<Integer> list){
    Set<Integer> aux = new HashSet<>();

    for(int v : list){
        aux.add(v);
    }

    return aux.size();

}

//numInCommon:
int numInCommon(List<Integer> list1, List<Integer> list2){
    Set<Integer> aux = new HashSet<>();
    Set<Integer> aux2 = new HashSet<>();
    for(int v : list1){
        aux.add(v);
    }
    for(int v : list2){
        if (aux.contains(v)){
            aux2.add(v);
        }
    }
    return aux2.size();
}

//unionSets:
Set<Integer> unionSets(Set<Set<Integer>> set){
    Set<Integer> aux = new HashSet<>();
    for(Set<Integer> s : set){
        for(int v : s){
            aux.add(v);
        }
    }
    return aux;
}

//wordCount:
int wordCount(String filename)throws FileNotFoundException {
    Scanner sc = new Scanner(new File(filename));
    Set<String> set = new HashSet<>();

    while(sc.hasNext()){
        set.add(sc.next());
    }
    return set.size();
}

//Contains Duplicate:
public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int v : nums){
            if (set.contains(v)){
                return true;
            }
            set.add(v);
        }
        return false;
    }
