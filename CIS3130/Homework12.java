// countNames:
class CountNames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        while (!name.isEmpty()){
            map.put(name, map.getOrDefault(name, 0) + 1);
            System.out.print("Enter name: ");
            name = sc.nextLine();
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Entry [" + entry.getKey() + "] has count " + entry.getValue());
        }
    }
}

// counts: 
Map<Integer, Integer> counts(List<Integer> list, Set<Integer> set){
    Map<Integer, Integer> res = new HashMap<>();
    for(Integer num : set){
        res.put(num, 0);
    }
    for(Integer num : list){
        if(res.containsKey(num)){
            res.put(num, res.get(num) + 1);
        }
    }
    return res;
}

// hasDuplicateValue:
boolean hasDuplicateValue(Map<String, String> map){
    if(map.isEmpty() || map.size() == 1) return false;
    Set<String> seen = new HashSet<>();

    for(String v : map.values()){
        if (seen.contains(v)){
            return true;
        }
        seen.add(v);
    }

    return false;
}

// hasThree:
boolean hasThree(List<String> list){
    Map<String, Integer> freq = new HashMap<>();

    for(String s : list){
        freq.put(s, freq.getOrDefault(s, 0) + 1);
        if(freq.get(s) >=3){
            return true;
        }
    }
    return false;
}

// Uniquue Number of occurences:
public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : arr){
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
    return new HashSet<Integer>(map.values()).size() == map.size();
}

// Sum of Unique Elements:
public int sumOfUnique(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i : nums){
        map.put(i, map.getOrDefault(i, 0) + 1);
    }

    int sum = 0;
    for (Integer k : map.keySet()){
        if (map.get(k) == 1){
            sum += k;
        }
    }

    return sum;
}

// Contains Duplicate:
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++){
        if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){
            return true;
        }
        map.put(nums[i], i);
    }
    return false;
}

// frequencyCount: 
public static int frequencyCount(Collection<String> collection, int frequency) {
    Map<String, Integer> freq = new HashMap<>();
    for(String s : collection){
        freq.put(s, freq.getOrDefault(s, 0) + 1);
    }
    int count = 0;
    for(Integer v : freq.values()){
        if(v == frequency) count++;
    }
    return count;
}

// maxFrequency:
public static int maxFrequency(Collection<String> collection) {
    Map<String, Integer> freq = new HashMap<>();
    for(String s : collection){
        freq.put(s, freq.getOrDefault(s, 0) + 1);
    }
    int max = 0;
    for(Integer v : freq.values()){
        max = Math.max(max, v);
    }

    return max;
}
