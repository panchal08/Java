import java.util.Scanner;
public class NumReverse {
	public static int reverse(int value) {
		int reverse = 0;
		while(value > 0) {
			int mol = value % 10;
			reverse = (reverse * 10) + mol;
			value = value / 10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		int num = s.nextInt();
		System.out.println("Reverse number	:"+reverse(num));
	}
}