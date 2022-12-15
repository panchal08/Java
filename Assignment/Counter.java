import java.util.Scanner;
public class Counter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		while ((num = num / 10) > 0) 
			count++;
		System.out.println(count);
	}
}