public class Patten6 {
	public static void main(String[] args) {
		for(int row = 1, val = 0; row < 6; System.out.println(), row++, val--) {
			for(int space = 5; space > row; System.out.print(" "), space--);
			for(int star = val; star < row; System.out.print("*"), star++);
		}
		for(int row = 1, val = 8; row < 5; System.out.println(), row++, val--) {
			for(int space = 0; space < row; System.out.print(" "), space++);
			for(int star = val; star > row; System.out.print("*"), star--);
		}
	}
}