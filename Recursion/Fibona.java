import java.util.Scanner;
public class Fibona {
	static int a=0,b=0,c=1;
	public static void fibo(int num) {
		if(num >= 0) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
			fibo(--num);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num : ");
		fibo(s.nextInt());
	}
}