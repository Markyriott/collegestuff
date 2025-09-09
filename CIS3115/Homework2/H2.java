public class H2{
    public static void main(String[] args){
        System.out.println("Question 1: ");
        print2DMatrix(Q1());

        System.out.println("Question 2: ");
        int[][] matrix = {
            {2,3,4},
            {5,4,3},
            {0,3,4},
            {2,4,5}
        };
        System.out.println(Q2(matrix));

        System.out.println("Question 3: ");
        print2DMatrix(transpose(matrix));
        
        System.out.println("Question 4: ");
        Q4(matrix);

        System.out.println("Question 5: ");

        System.out.println("Question 6: ");
        int[][] symmetricMatrix = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
        };
        System.out.println(Q6(matrix));
        System.out.println(Q6(symmetricMatrix));

        System.out.println("Question 7: ");

        System.out.println("Question 8: ");

        System.out.println("Question 9: ");
        Q9(matrix);
        
        System.out.println("Question 10: ");
        spiralOrder(matrix);
    }

    static void print2DMatrix(int[][] matrix){
        for (int[] a : matrix){
                for(int v : a) System.out.print(v + "\t");
                System.out.println();
        }
    }

    static int[][] Q1(){ // Initialize matrix 3x3 and print
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        return matrix;
    }

    static int Q2(int[][] matrix) { // Find sum of 3x4 int matrix
        int count = 0;

        for (int[] a : matrix){
            for (int v : a) count += v;
        }
        return count;
    }

    static int[][] transpose(int[][] matrix){ //Q3; Transpose mxn matrix
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            } 
        }
        return transpose;
    }

    static void Q4(int[][] matrix){ // Find max and print index
        int[] max = {0,0,0};

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > max[0]){
                    max[0] = matrix[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }

        System.out.println("Max = " + max[0] + " on column " + max[2] + ", row " + max[1]);
    }

    static void Q5(int[][] m1, int[][] m2){ //Multiplt matrices
        int[][] Matrix = new int[m1[0].length][m2.length];
    }

    static boolean Q6(int[][] matrix){ // symmetric
        int[][] transpose = transpose(matrix);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j ++){
                if (matrix[i][j] != transpose[i][j]) return false;
            }
        }
        return true;
    }

    static void Q7(){}

    static void Q8(){}

    static void Q9(int[][]matrix){
        int[] max = {0,0};

        for (int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
            if (sum > max[0]){
                max[0] = sum;
                max[1] = i;
            }
        }
        System.out.println("row: " + max[1] + " sum: " + max[0]);
    }
    
    static void spiralOrder(int[][] matrix){
        for (int i = 0; i < matrix.length; i += 2){
            for (int j = 0; j < matrix[i].length; j++){
                for (int t = 0; t < j; t++) System.out.print("\t");
                System.out.print(matrix[i][j] + "\t");
                System.out.println();
            }
            System.out.println();

            if (i + 1 >= matrix.length) break;

            for (int j = matrix[i+1].length - 1; j >= 0; j--){
                for (int t = 0; t < j; t++) System.out.print("\t"); 
                System.out.print(matrix[i+1][j]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
