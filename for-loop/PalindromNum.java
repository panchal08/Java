import java.util.Scanner;
public class PalindromNum {
	public static boolean check(int num) {
		int value = num;
		int store = 0;
		for(int i = 1, ran = 0, itret = num; i < itret; i++) {
			ran = num % 10;
			if(ran > 0)
			store = (store * 10) + ran;
			num = num / 10;
		}
		if(store == value) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		boolean flag = check(s.nextInt());
		if(flag) System.out.println("Number is Palindrom");
		else System.out.println("Number is not Palindrom");
	}
}