public class ASCII {
	public static void main(String[] args) {
		System.out.println("Capital");
		for(int i = 65; i < 91; i++) {
			char ch = (char)i;
			System.out.print(ch+" = "+i+"	");
		}
		System.out.println("\nSmall");
		for(int i = 97; i < 123; i++) {
			char ch = (char)i;
			System.out.print(ch+" = "+i+"	");
		}
	}
}