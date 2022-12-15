public class Patten10 {
	public static void main(String[] args) {
		for(int row = 0; row < 5; System.out.println(), row++) {
			for(int even = 1; even < 6 && row % 2 == 0; System.out.print(" 1"), even++);
			for(int odd = 1; odd < 6 && !(row % 2 == 0); System.out.print(" 0"), odd++);
}	}	}