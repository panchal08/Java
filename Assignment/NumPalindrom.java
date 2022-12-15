import java.util.Scanner;
public class NumPalindrom {
	public static void palindrom(int value) {
		int store = value;
		int reverse = 0;
		while(value > 0) {
			int mol = value % 10;
			reverse = (reverse * 10) + mol;
			value = value / 10;
		}
		if(store == reverse)
			System.out.println("Palindrom");
		else
			System.out.println("not a palindrom");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		int num = s.nextInt();
		palindrom(num);
	}
}