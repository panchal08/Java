import java.util.Scanner;
public class GST {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter amount		:");
		int amount = s.nextInt();
		int gst = (amount * 18)/100;
		int answer = amount + gst;
		System.out.println("Amount with GST	:"+answer);
	}
}