import java.util.Scanner;

public class Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++){
			System.out.println("Input number: ");
			arr[i] = sc.nextInt();
		}
		printEven(arr);
	}

	public static void printEven(int[] arr){
		for(int v : arr){
			if (v % 2 == 0) System.out.println(v);
		}
	}

}
