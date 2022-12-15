import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); 
		int factorial = 1;
		for (int fact = 1; fact <= num; fact++)
			factorial = factorial * fact;
		System.out.println(factorial);
	}
}