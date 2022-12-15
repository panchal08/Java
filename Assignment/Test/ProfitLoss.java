import java.util.Scanner;
public class ProfitLoss {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter purchase amount	:");
		int purchase = s.nextInt();
		System.out.print("Enter sale amount	:");
		int sale = s.nextInt();
			if(purchase < sale) {
				System.out.println("You have a profite	:"+(sale - purchase));
			} else {
				System.out.println("You have a loss	:"+(purchase - sale));
			}
	}
}