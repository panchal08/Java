import java.util.Scanner;
public class StringPalindrom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String reverse = "";
		for (int length = str.length()-1; length >= 0; length--)
			reverse = reverse + str.charAt(length);
		if (str.equals(reverse))
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrom");
	}
}