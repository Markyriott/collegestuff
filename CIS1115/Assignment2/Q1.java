import java.util.Scanner;
public class Q1{
	public static void main(String[]args){	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		float p = input.nextInt();
		System.out.println("Enter the annual interest rate in percentage: ");
		float r = input.nextInt();
		System.out.println("Enter the time in years: ");
		float t = input.nextInt();
		float simpleInterest = (p*r*t)/100;
		System.out.println("The simple interest is " + simpleInterest);
	}
}
