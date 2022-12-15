import java.util.Scanner;
public class Encription {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String value = s.next();
		for (int i = 0; i < value.length(); i++) {
			char ch = (char)(value.charAt(i) + 3);
			if (ch > 122)
				ch = (char)(ch - 26);
			System.out.print(ch+"\t");
		}
	}
}