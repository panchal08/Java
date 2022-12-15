import java.util.*;
public class CheckNegPosiZero {
	public static String check(int num) {
		if(num > 0) return "Positive";
		else if(num < 0) return "Nagative";
		else return "Zero";
	}
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner s = new Scanner(System.in);
		String ans = check(s.nextInt());
		System.out.println(ans);
	}
}