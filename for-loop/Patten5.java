public class Patten5 {
	public static void main(String[] args) {
		for(int row = 1; row < 5; System.out.println(), row++) {
			for(int space = 4; space > row; System.out.print(" "), space--);
			for(int star = 1; star <= row; System.out.print("*"), star++);
			System.out.print(" ");
			for(int star = 1; star <= row; System.out.print("*"), star++);
		}
	}
}