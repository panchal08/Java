public class TestMain {
	static {
		for(int row = 1; row < 6; row++) {
			for(int space = 5; space > row; space--) {
				System.out.print(" ");
			}
			for(int star = 1; star <= row; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		TestMain tm = new TestMain();
		System.exit(0);
	}	
	{
		//Instance Block
		System.out.println("Sterling Institude");
	}
}