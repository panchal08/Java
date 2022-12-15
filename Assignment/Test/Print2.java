public class Print2 {
	public static void main(String[] args) {
		int i = 1;
		while(i < 6) {
			int j = 1;
			char ch = 65;
			while(j <= i) {
				System.out.print(ch);
				ch++;
				j++;
			}
			System.out.println();
			i++;
		}
		for(int x = 1; x < 6; x++) {
			char ch = 65;
			for(int y = 1; y <= x; y++, ch++)
				System.out.print(ch);
			System.out.println();
		}
	}
}