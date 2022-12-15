public class Star4 {
	public static void main(String[] args) {
		for (int row = 1; row < 6; System.out.println(), row++) {
			for (int space = 5; space > row; space--)
				System.out.print(" ");
			for (int star = 0; star < row; star++)
				System.out.print("*");
			System.out.print(" ");
			for (int star = 0; star < row; star++)
				System.out.print("*");
			
		}
	}
}