public class Star3 {
	public static void main(String[] args) {
		for (int row = 1; row < 10; System.out.println(), row++) {
			if (row < 6) {
				for (int space = 5; space > row; System.out.print(" "), space--);
				for (int star = 0; star < row; System.out.print("* "), star++);
			} else {
				for (int space = 5; space < row; System.out.print(" "), space++);
				for (int star = 10; star > row; System.out.print("* "), star--);
			}
		}
	}
}