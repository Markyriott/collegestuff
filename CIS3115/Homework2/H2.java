public class H2{
    public static void main(String[] args){
        // Question 1:
        System.out.println(reverseString("The cat is fat"));

        //Question 2:
        System.out.println(sumDigits(123));

        //Question 3:
        System.out.println(isPalindrome("racecar"));

        //Question 4:
        System.out.println(power(4, 9));

        //Question 5:
        Q5(5);

        //Question 6:
        System.out.println(gcd(18, 28));

        //Question 7:
        System.out.println(exponent(3.5, 3));
    }

    static String reverseString(String str){ 
        if (str.length() == 0) return "";

        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    static int sumDigits(int n){
        if (n == 0) return 0;

        return (n % 10) + sumDigits(n / 10);
    }

    static boolean isPalindrome(String s){
        if (s.length() <= 1) return true;

        if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        else {
            return isPalindrome(s.substring(1, s.length() -1));
        }
    }

    static int power(int x, int n){
        if (n == 1) return x;

        return x * power(x, n - 1);
    }

    static void Q5(int disks){


    }

    static int gcd(int a, int b){
        if (b == 0) return a;

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        return gcd(b, a % b);
    }

    static double exponent(double base, int exp){
        if (exp == 0) return 1.0;

        return base * exponent(base, exp - 1);
    }
}
