public class Q3{
	public static void reverseArr(int[] arr){
		int i = 0;
		int j = arr.length - 1;
		while (i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
