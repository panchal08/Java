import java.util.Scanner;
public class Factorial {
	public static int check(int num) {
		int factorial = 1;
		for(int fact = 1; fact <= num; fact++)
			factorial = factorial * fact;
		return factorial;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	: ");
		System.out.println("Factorial	: "+check(s.nextInt()));
	}
}