import java.util.Scanner;
public class CheckPerfactNum {
	public static boolean(int num) {
		int perfact = 0;
		for(int i = 1; i < num; i++)
			if(num % i == 0) perfact = perfact + i;
		if(num == perfact) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		boolean flag = check(s.nextInt());
		if(flag) System.out.println("This is Perfact Number");
		else System.out.println("This is not Perfact Number");
	}
}