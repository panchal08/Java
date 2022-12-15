public class Patten4 {
	public static void main(String[] args) {
		for(int next = 1; next < 6; System.out.println(), next++) {
			for(int space = 4; space >= next; System.out.print(" "), space--);
			for(int star = 0; star < next; System.out.print("* "), star++);
		}
	}
}