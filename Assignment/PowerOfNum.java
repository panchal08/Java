import java.util.Scanner;
public class PowerOfNum {
	public static int power(int val1, int val2) {
		int ans = 1;
		for(int i = 1; i <= val2; i++)
			ans = ans * val1;
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		int num = s.nextInt();
		System.out.print("Enter power	:");
		int power = s.nextInt();
		System.out.println("Answer		:"+power(num, power));
	}
}