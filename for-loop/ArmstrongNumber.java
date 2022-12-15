import java.util.Scanner;
public class ArmstrongNumber {
	public static boolean check(int num) {
		int count = 0;
		int counter = num;
		int store = 0;
		int com = num;
		int val = 1;
		while(counter > 0) {
			counter = counter / 10;
			count++;
		}
		while( num > 0) {
			int ram = num % 10;
			for(int multi = 0; multi < count; multi++) 
				val = val * ram;
			store = store + val;
			val = 1;
			num = num / 10;
		}
		if(store == com) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		boolean flag = check(s.nextInt());
		if(flag) System.out.println("This is Armstrong number");
		else System.out.println("This is not Armstrong number");
	}
}