import java.util.Scanner;

public class Q7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double x = Math.random() * 10;
		double y = Math.random() * 10;

		System.out.println("X: " + x + " Y: " + y);

		String operation = sc.nextLine();

		switch (operation){
			case "+": System.out.println(x + y); break;
			case "-": System.out.println(x - y); break;
			case "*": System.out.println(x * y); break;
			case "/": System.out.println(x / y); break;
			default : System.out.println("Invalid operator");
		}
	}
}
