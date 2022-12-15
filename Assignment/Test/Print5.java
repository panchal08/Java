public class Print5 {
	public static void main(String[] args) {
		int i = 1;
		char ch = 65;
		while(i < 6) {
			int j = 6;
			int k = 1;
			while(j > i) {
				System.out.print(" ");
				j--;
			}
			while(k <= i) {
				System.out.print(ch);
				k++;
			}
			System.out.print(" ");
			k = 1;
			while(k <= i) {
				System.out.print(ch);
				k++;
			}
			System.out.println();
			ch++;
			i++;
		}
		ch = 65;
		for(int x = 1; x < 6; x++) {
			for(int y = 6; y > x; y--)
				System.out.print(" ");
			for(int z = 1; z <= x; z++)
				System.out.print(ch);
			System.out.print(" ");
			for(int z = 1; z <= x; z++)
				System.out.print(ch);
			System.out.println();
			ch++;
		}
	}
}