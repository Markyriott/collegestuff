public class H2{
    void main(String[] args){
        IO.println(sum(5));
        IO.println(repeat("bob", 5));
        IO.println(contains("racecar", 'w'));
        IO.println(count("racecar", 'r'));
        IO.println(equals("racecar","raar"));
    }

    int sum(int n){
        if (n <= 0) throw new IllegalArgumentException();
        if (n == 1) return n;
        return n + sum(n - 1);
    }

    String repeat(String s, int n){
        if (n <= 0) throw new IllegalArgumentException();
        if (n == 1) return s;
        return s + repeat(s, n-1);
    }

    boolean contains(String s, char ch){
        if (s.isEmpty()) return false;
        return s.charAt(0) == ch || contains(s.substring(1), ch);
    }

    int count(String s, char ch){
        if (s.isEmpty()) return 0;
        int i = s.charAt(0) == ch ? 1 : 0;
        return i + count(s.substring(1), ch);
    }

    boolean equals(String s1, String s2){
        if (s1.isEmpty() && s2.isEmpty()) return true;
        else if (s1.isEmpty() || s2.isEmpty()) return false;
        return s1.charAt(0) == s2.charAt(0) && equals(s1.substring(1), s2.substring(1));
    }

    boolean isSorted(String s){
        if (s.length() <= 1) return true;
        return s.charAt(0) <= s.charAt(1) && isSorted(s.substring(1));
    }

    boolean containsConsecutiveDuplicate(String s){
        if (s.length() <= 1) return false;
        return s.charAt(0) == s.charAt(1) || containsConsecutiveDuplicate(s.substring(1));
    }

}

