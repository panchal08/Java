public class Print14 {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			for(int space = 5; space > i; space--)
				System.out.print(" ");
			for(int star = 1; star <= i; star++)
				System.out.print("* ");
			System.out.println();
		}
	}
} 