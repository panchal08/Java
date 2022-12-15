import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num.	:");
		int num = s.nextInt();
		if(num % 4 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}