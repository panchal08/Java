import java.util.*;
public class RecursionDemo2 {
	static int num;
	public static void row(int r) throws Exception {
		if(r == 1) {
			System.out.println("*");
			row(--num);
		} else if(r > 1) {
			System.out.print("*");
			row(--r);
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Row : ");
		num = s.nextInt();
		row(num);
	}
}