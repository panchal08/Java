import java.util.Scanner;
public class CalculateParsentage {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Amount	:");
		int amount = s.nextInt();
		System.out.print("Enter parsent	:");
		int parsent = s.nextInt();
		float answer = (amount * parsent)/100;
		System.out.println("Parsent		:"+answer);
	}
}