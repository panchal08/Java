import java.util.Scanner;
public class Divisable {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter num.	:");
		int num = s.nextInt();
		if(num % 5 == 0 && num % 11 == 0)
			System.out.println("Num. is divisable by 5 and 11");
		else
			System.out.println("Num. is't divisable by 5 and 11");
	}
}