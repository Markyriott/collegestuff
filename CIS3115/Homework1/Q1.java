public class Q1{
    public static void main(String[] args){
       System.out.println(gcd(30,45)); 

       int[] a = {0,2,2,4,9,5,6,8};
       System.out.println(sumEven(a));

       int[] b = {1,2,3,4,5,6};
       System.out.println(sorted(a));
       System.out.println(sorted(b));

       System.out.println(copy(a));
    }


    static int gcd(int x, int y) { // 1. Return the greatest common divisor of x and y.
       int res = Math.min(x,y);

       while ( res > 0 ) {
           if (x % res == 0 && y % res == 0) {
               break;
           }
           res --;
       }

       return res;
    }

    static int sumEven(int[] a){ // 2. Return the sum of the even integers in array a.
        int res = 0;

        for (int v : a){
            if (v % 2 == 0) res += v; 
        }
        return res;
    }

    static boolean sorted(int[] a){ // 3. Test if array a is sorted in ascending order.
        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]) return false;
        }
        return true;
    }

    static int[] copy(int[] a){ // 4. Return a copy of arary a.
        int[] arrCopy = new int[a.length];

        for (int i = 0; i < a.length; i++){
            arrCopy[i] = a[i];
        }
        return arrCopy;
    }

    static int[] eliminateDuplicates(int[] a){ // 5. Return a copy of array a without duplicates.

    }

    static char tic_tac_toe(char[][] grid){ // 6. 
    
    }

    static long bin_str_to_int(String binStr){ // 7. Convert an unsigned binary string to a decimal integer.

    }

    public static double[][] addMatrix(double[][] a, double[][] b){ // 8. Return the sum of two matrices.

    } 

    public static boolean checkNQueensSolution(boolean[][] board){ // 9. 

    }
}
