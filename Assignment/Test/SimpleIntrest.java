import java.util.Scanner;
public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Amount	:");
		int amount = s.nextInt();
		System.out.print("Enter Rate	:");
		int rate = s.nextInt();
		System.out.print("Enter Time	:");
		int time = s.nextInt();
		float intrest = (amount * rate * time)/100;
		System.out.println("Simple Intrest	:"+intrest);
	}
}