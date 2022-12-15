import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int com = num;
		int count = num;
		int counter = 1;
		int sum = 0;
		while ((count = count / 10) > 0)
			counter++;
		while (num > 0 ) {
			int rdm = num % 10;
			int store = 1;
			for (int i = 1; i <= counter; i++)
				store = store * rdm;
			sum = sum + store;
			num = num / 10;
		}
		if (sum == com)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
	}
}