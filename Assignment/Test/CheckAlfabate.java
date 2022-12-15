import java.util.Scanner;
public class CheckAlfabate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any key	:");
		char ch = s.next().charAt(0);
		if((ch > 64 && 91 > ch)||(ch > 96 && 123 > ch))
			System.out.println("Alfabate");
		else
			System.out.println("Not a alfabate");
	}
}