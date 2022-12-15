public class SwapingUseVariable {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c;
			c = a;
			a = b;
			b = c;
			System.out.println(a+"	"+b);
	}
}