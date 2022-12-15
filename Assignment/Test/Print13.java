public class Print13 {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			for(int star = 1; star <= i; star++)
				System.out.print("*");
			System.out.println();
		}
	}
}