import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		System.out.println(value+" Square of = "+value*value);
		for (int num = 2; num <= 10; num++)
			System.out.println(num+" square = "+num*num);
	}
}