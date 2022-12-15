public class Print4 {
	public static void main(String[] args) {
		int  i = 1;
		while(i < 6) {
			int j = 6;
			int k = 1;
			char ch = 65;
			while(j > i) {
				System.out.print(" ");
				j--;
			}
			while(k <= i) {
				System.out.print(ch+" ");
				ch++;
				k++;
			}
			System.out.println();
			i++;
		}
		for(int x = 1; x < 6; x++) {
			char ch = 65;
			for(int y = 6; y > x; y--)
				System.out.print(" ");
			for(int k = 1; k <= x; k++, ch++)
				System.out.print(ch+" ");
			System.out.println();
		}
	}
}