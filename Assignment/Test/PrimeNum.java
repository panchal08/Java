import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num	:");
		int num = s.nextInt();
		int count = 0;
		for(int i = 2; i <= num; i++)
			if(num % i == 0)
				count++;
		if(count == 1)
			System.out.println("Num. Prime");
		else
			System.out.println("Num. is't Prime");
	}
}