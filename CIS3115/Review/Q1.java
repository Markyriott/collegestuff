import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q1{
    public static void main(String[] args){
       System.out.println(gcd(30,45)); 

       int[] a = {0,2,2,4,9,5,6,8};
       System.out.println(sumEven(a));

       int[] b = {1,2,3,4,5,6};
       System.out.println(sorted(a));
       System.out.println(sorted(b));

       System.out.println(Arrays.toString(copy(a)));

       System.out.println(Arrays.toString(eliminateDuplicates(a)));

       char[][] ticTacToe = {{'X',' ','O'},{'O','X',' '},{'O',' ','X'}};
       char[][] ticTacToe2 = {{' ','O','O'},{'X','O',' '},{'X','O','X'}};
       System.out.println(tic_tac_toe(ticTacToe));
       System.out.println(tic_tac_toe(ticTacToe2));
       
       System.out.println(bin_str_to_int("11010"));

       double[][] m1 = {{0,3,6},{3,2,5},{5,7,9}};
       double[][] m2 = {{4,2,9},{1,4,3},{7,7,7}};
       System.out.println(Arrays.deepToString(addMatrix(m1,m2)));
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
        Set<Integer> seen = new HashSet<>();
        int[] res = new int[a.length];

        for(int i = 0; i < a.length; i++){
            if (!seen.contains(a[i])){
                res[i] = a[i];
                seen.add(a[i]);
            }
        }

        return res;
    }

    
    static char tic_tac_toe(char[][] grid){ // 6. tictactoe
        int[][] configurations = {{0,0,0},{1,1,1},{2,2,2},{0,1,2},{2,1,0}};
        char res = ' ';

        for (int i = 0; i < configurations.length; i++){
            char a = grid[0][configurations[i][0]];
            char b = grid[1][configurations[i][1]];
            char c = grid[2][configurations[i][2]];
            if (a == b && b == c){
                return a;
            }
        }
        return 'D';
    }

    
    static long bin_str_to_int(String binStr){ // 7. Convert an unsigned binary string to a decimal integer.
        int res = 0;
        for(int i = 0; i < binStr.length(); i++){
            int pos = (binStr.length() - i) -1;
            if (binStr.charAt(i) == '1'){
                res = res + (int) Math.pow(2, pos);
            }
        }
        return res;
    }

    public static double[][] addMatrix(double[][] a, double[][] b){ // 8. Return the sum of two matrices.
        double[][] res = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j <a[i].length; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    } 
    /*
    public static boolean checkNQueensSolution(boolean[][] board){ // 9. 
        return true;
    }
    */
}
