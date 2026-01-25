record Name(String first, String last) {
    @Override
    public String toString() {
        return first + " " + last;
    }
}

/**
 * A phone number, such as 718-951-0430 consists of an area code (718), 
 * a prefix (951), and a line number (0430).
 */
record PhoneNumber(String areaCode, String prefix, String lineNumber) {
    @Override
    public String toString() {
        return areaCode + "-" + prefix + "-" + lineNumber;
    }
}

public class Phonebook {
    private final Map<Name, Set<PhoneNumber>> map = new HashMap<>();

    // associates the given phoneNumber with the given name;
    // the name might already exist in the phonebook
    public void add(Name name, PhoneNumber phoneNumber) {
        map.put(name, map.getOrDefault(name, new HashSet<PhoneNumber>()));
        map.get(name).add(phoneNumber);
    }

    public void remove(Name name) {
        if(map.containsKey(name)){
            map.remove(name);
        }
    }

    // removes the given phoneNumber for the given name
    public void remove(Name name, PhoneNumber phoneNumber) {
        if (map.containsKey(name) && map.get(name).contains(phoneNumber)){
            map.get(name).remove(phoneNumber);
        }
    }

    public Set<PhoneNumber> lookup(Name name) {
        return map.getOrDefault(name, new HashSet<>());
    }

    public Set<Name> reverseLookup(PhoneNumber phoneNumber) {
        Set<Name> res = new HashSet<>();
        for (Map.Entry<Name, Set<PhoneNumber>> entry : map.entrySet()){
            if (entry.getValue().contains(phoneNumber)){
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public Set<Name> names() {
        return map.keySet();
    }

    public Set<PhoneNumber> phoneNumbers() {
        Set<PhoneNumber> res = new HashSet<>();

        for(Set<PhoneNumber> phoneNum : map.values()){
            for(PhoneNumber pn : phoneNum){
                res.add(pn);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Name name : map.keySet()){
            sb.append(name + ":");
            for (PhoneNumber phoneNumber : map.get(name)){
                sb.append(", " + phoneNumber);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // returns the maximum number of phone numbers per name
    public int maxPhoneNumbers() {
        int max = 0;

        for(Set<PhoneNumber> set : map.values()){
            max = Math.max(max, set.size());
        }
        return max;
    }
}

void main(){

}
