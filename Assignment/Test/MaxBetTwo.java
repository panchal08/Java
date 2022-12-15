import java.util.Scanner;
public class MaxBetTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two num.	:");
		int a = s.nextInt();
		int b = s.nextInt();
		if(a > b)
			System.out.println("Greater num.	:"+a);
		else
			System.out.println("Greater num.	:"+b);
	}
}