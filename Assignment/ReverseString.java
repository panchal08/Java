import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for (int length = str.length()-1; length >= 0; length--)
			System.out.print(str.charAt(length));
	}
}