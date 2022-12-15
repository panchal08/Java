public class Patten8 {
	public static void main(String[] args) {
		for(int row = 1, val = 1; row < 5; System.out.println(), row++) {
			for(int num = 1; num <= row; System.out.print(val++), num++);
		}
	}
}