public class Print12 {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			int star;
			int space;
			for(int j = 5; j > i; j--)
				System.out.print(" ");
			if(i == 1 || i == 5){
				star = 5;
				space = 0;
			} else {
				star = 1;
				space = 3;
				System.out.print("*");
			}
			while(space > 0) {
				System.out.print(" ");
				space--;
			}
			while(star > 0) {
				System.out.print("*");
				star--;
			}
			System.out.println();
		}
	}
}