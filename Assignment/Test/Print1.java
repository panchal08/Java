public class Print1 {
	public static void main(String[] args) {
		int i = 1;
		while(i < 6) {	
			int j = 1;
			while(j < 6){
				System.out.print("A");
				j++;
			}
			System.out.println();
			i++;
		}
		for(int x = 1; x < 6; x++){
			for(int y = 1; y < 6; y++)
				System.out.print("A");
			System.out.println();
		}
	}
}