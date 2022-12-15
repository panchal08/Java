import java.util.Scanner;
public class MaxBW3Num {
	public static int compare(int a, int b, int c) {
		if(a > b && a > c)
			return a;
		else if(b > a && b > c)
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
		System.out.println("Enter 3 Numbers for Comparison : ");
		Scanner s = new Scanner(System.in);
		int greater = compare(s.nextInt(), s.nextInt(), s.nextInt());
		System.out.println("Greater : "+greater);
	}
}