public class Print8 {
	public static void main(String[] args) {
		int val = 1;
		for(int i = 1; i < 8; i++) {
			if(i < 5) {
				for(int space = 4; space > i; space--)
					System.out.print(" ");
				for(int star = 1; star <= val; star++)
					System.out.print("A");
				val+=2;
			} else {
				val-=2;
				for(int space = 4; space < i; space++)
					System.out.print(" ");
				for(int star = 3; star <= val; star++)
					System.out.print("A");
			}
			System.out.println();
		}
	}
}