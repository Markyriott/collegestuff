import java.util.Scanner;
public class Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms: ");
		double kg = input.nextDouble();
		System.out.println("Enter your height in meters: ");
		double m = input.nextDouble();
	        double bmi = kg/(m*m);
		System.out.println("Your BMI is " + bmi);
	}
}
