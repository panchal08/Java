public class PyramidPrintWithSpace {

	public static void main(String[] args) {
	
		for(int col = 1; col < 6; col++){
			
			for(int space = 5; space > col; space--){
				System.out.print(" ");
			}
			
			for(int row = 0; row < col; row++){
				System.out.print("*");
			}
			
			System.out.print(" ");
			for(int row = 0; row < col; row++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}