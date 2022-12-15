import java.util.Scanner;
public class PrintWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number	:");
		char ch = (char)s.nextInt();
		if(ch > 64 && 91 > ch || ch > 96 && 123 > ch)
			System.out.println("Alphabet is	:"+ch);
		else System.out.println("Not a Alphabet");
	}
}