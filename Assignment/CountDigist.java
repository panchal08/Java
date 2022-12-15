import java.util.Scanner;
public class CountDigist {
	public static int counter(int digit) {
		int count = 0;
		for(int num = digit; digit > 0; count++) 
			digit = digit / 10;
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number		:");
		int num = s.nextInt();
		System.out.println("Digits of a number 	:"+counter(num));
	}
}