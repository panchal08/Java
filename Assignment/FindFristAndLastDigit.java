import java.util.Scanner;
public class FindFristAndLastDigit {
	public static void find(int find) {
		int f1 = 0;
		int l1 = find;
		while(find > 0) {
			int ran = find % 10;
			f1 = (f1 * 10) + ran;
			find = find / 10;
		}
		f1 = f1 % 10;
		l1 = l1 % 10;
		System.out.println("Frist digit	:"+f1+"\nLast digit	:"+l1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number	:");
		int num = s.nextInt();
		find(num);
	}
}