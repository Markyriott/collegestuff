import java.util.Scanner;

public class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double bmi = weight/(height*height);

		if (bmi < 18.5){System.out.println("Underweight");}
		else if (bmi >= 30){System.out.println("Obese");}
		else if (bmi >= 25){System.out.println("Overweight");}
		else if (bmi >= 18.5){System.out.println("Normal Weight");}
	}
}
