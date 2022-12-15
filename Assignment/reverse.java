import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int store = num;
		int rev = 0;
		while (num > 0) {
			int ron = num % 10;
			rev = (rev * 10) + ron;
			num = num / 10;
		}
		if(rev == store)
			System.out.println("Number Palindrom");
		else
			System.out.println("Number is not Palindrom");
	}
}