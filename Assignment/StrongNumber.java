import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		int store = num;
		while (num > 0) {
			int rdm = num % 10;
			int factorial = 1;
			for (int fact = 1; fact <= rdm; fact++)
				factorial = factorial * fact;
			sum = sum + factorial;
			num = num / 10;
		}
		if (sum == store)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
}