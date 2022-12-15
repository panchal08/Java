import java.util.Scanner;
public class SumOfDigits {
	public static int sum(int value) {
		int sum = 0;
		while(value > 0) {
			int digit = value % 10;
			sum = sum + digit;
			value = value / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		int num = s.nextInt();
		System.out.println("Sum of number	:"+sum(num));
	}
}