class Q1{
    public static void main(String[] args){
    	System.out.println(sumOfDigits(32034));
    }

    static int sumOfDigits(int n){
	    if (n == 0)
		return 0;
	    return (n %10) + sumOfDigits(n/10);
    }
}
