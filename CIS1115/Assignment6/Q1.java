class Q1{
	public static void main(String[] args){
		int[] arr = {5,3,2,5,7,4,3,9};
		System.out.println(ArrMax(arr));
	}
	public static int ArrMax(int[] arr){
		int max = 0;
		for(int i : arr){
			max = i > max ? i : max;
		}
		return max;
	 }
}
