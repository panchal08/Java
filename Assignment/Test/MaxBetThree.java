import java.util.Scanner;
public class MaxBetThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three num.	:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a > b && a > c) 
			System.out.println("Greater num.	:"+a);
		else if(b > c)
			System.out.println("Greater num.	:"+b);
		else
			System.out.println("greater num.	:"+c);
	}
}