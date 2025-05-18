import java.util.Scanner;

public class Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int distance = x*x + y*y;

		int radius = 100 * 100;

		if (distance > radius) {System.out.println("Outside of circle radius");}
		else if(distance < radius){System.out.println("Inside of circle radius");}
		else if (distance == radius){System.out.println("On circle radius");}
	}
}
