public class Print7 {
	public static void main(String[] args) {
		char ch = 65;
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++, ch++)
				System.out.print(ch);
			System.out.println();
		}
	}
}