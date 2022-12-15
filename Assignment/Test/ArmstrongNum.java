import java.util.Scanner;
public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num	:");
		int num = s.nextInt();
		int comp = num;
		int store = num;
		int count = 1;
		int sum = 0;
		while((num = num /10)> 0)
			count++;
		while(store > 0) {
			int mol = store % 10;
			int digit = 1;
			for(int i = 1; i <= count; i++)
				digit = digit * mol;
			sum = sum + digit;
			store = store / 10;
			System.out.println(sum);
		}
		if(sum == comp)
			System.out.println("Num. is Armstrong");
		else
			System.out.println("Num. is't Armstrong");
	}
}