//com.jdbc.project;
import java.util.Scanner;
public class Main {
	int exit;
	private void getStart(Main main) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n	Enter 1 for Login");
		System.out.println("	Enter 2 for Signup");
		System.out.println("	Enter 3 for exit");
		System.out.print("	");
		int flag = sc.nextInt();
		if(flag == 1) LoginIn.login();
		else if(flag == 2) SignUp.signup();
		else if(flag == 3) {
			Success.success(Success.see);
			System.exit(0);
		} else {
			exit++;
			if(exit == 3) {
				Error.error(Error.mte);
				System.exit(0);
			}
			Error.error(Error.npe);
			main.getStart(main);
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.getStart(main);
	}
}