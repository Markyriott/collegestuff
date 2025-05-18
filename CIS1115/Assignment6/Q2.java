public class Q2{
	public static void main(String[] args){
		int[] arr = {6, 210, 43, 2, 90, 90};
		System.out.println(maxVal(arr));
	}

	public static int maxVal(int[] arr){
		int index = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
}
