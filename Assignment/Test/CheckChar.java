import java.util.Scanner;
public class CheckChar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Char.	:");
		char ch = s.next().charAt(0);
		if(ch >= 65 && 90 >= ch)
			System.out.println("UpperCase");
		else if (ch >= 97 && 122 >= ch)
			System.out.println("LowerCase");
	}
}