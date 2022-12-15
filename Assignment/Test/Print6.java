public class Print6 {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			int j = 1;
			if(i == 1 || i == 5)
				j = -3;
			else
				System.out.print("  ");
			while(j <= 1) {
				System.out.print("A");
				j++;
			}
			System.out.println();
		}
	}
}