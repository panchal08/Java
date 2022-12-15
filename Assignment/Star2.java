public class Star2 {
	public static void main(String[] args) {
		for (int row = 1; row < 6; System.out.println(), row++) {
			for (int space = 5; space > row; System.out.print(" "), space--);
			for (int star = 0; star < row; System.out.print("* "), star++);
		}
	}
}