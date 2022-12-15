import java.util.Scanner;
public class CheckNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num.	:");
		int num = s.nextInt();
		if(num > 0)
			System.out.println("Num. is Positive");
		else if(num < 0)
			System.out.println("Num. is Negative");
		else
			System.out.println("Num. is Zero");
	}
}