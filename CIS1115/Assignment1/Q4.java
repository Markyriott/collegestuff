import java.util.Scanner;
public class Q4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		int celsius = input.nextInt();
		int fahrenheit = (celsius * 9/5 + 32);
		System.out.println("It is " + fahrenheit + "° Fahrenheit");
	}
}
