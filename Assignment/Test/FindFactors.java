import java.util.Scanner;
public class FindFactors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		int num = s.nextInt();
		for(int n = 1; n < num + 1; n++)
			if(num % n == 0)
				System.out.print(n+"	");
	}
}