import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		int num = s.nextInt();
		int fact = 1;
		for(int n = num; n > 0;n--)
			fact = fact * n;
		System.out.println(fact);
	}
}