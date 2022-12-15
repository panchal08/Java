import java.util.Scanner;
public class CheckPrimeNum {
	public static boolean check(int num) {
		int count = 0;
		for(int prime = 2; prime <= num; prime++)
			if(num % prime == 0) count++;
		if(count == 1) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		boolean flag = check(s.nextInt());
		if(flag) System.out.println("Number is Prime");
		else System.out.println("Number is not Prime");
	}
}