import java.util.Scanner;
public class SwapFristAndLastDigit {
	public static void swap(int find) {
		int f1 = 0;
		int l1 = find;
		int addFrist = 0;
		int addLast = 0;
		while(find > 0) {
			int ran = find % 10;
			f1 = (f1 * 10) + ran;
			find = find / 10;
		}
		addLast = f1 / 10;
		f1 = f1 % 10;
		l1 = l1 % 10;
		addLast = (addLast * 10) + l1;
		while(addLast > 0) {
			int ran = addLast % 10;
			addFrist = (addFrist * 10) + ran;
			addLast = addLast / 10;
		}
		addFrist = addFrist / 10;
		addFrist = (addFrist * 10) + f1;
		System.out.println("Swap 	 	:"+addFrist);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number	:");
		int num = s.nextInt();
		swap(num);
	}
}