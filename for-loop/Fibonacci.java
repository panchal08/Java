import java.util.Scanner;
public class Fibonacci {
	public static void fibo(int num) {
		for(int i = 0, a = 0, b = 0, c = 1; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		fibo(s.nextInt());
	}
}
