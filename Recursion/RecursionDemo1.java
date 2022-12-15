import java.util.*;
public class RecursionDemo1 {
	public static int fact(int f) {
		if(f == 1) return 1;
		else return f * fact(f - 1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int f = fact(s.nextInt());
		System.out.println(f);
	}
}