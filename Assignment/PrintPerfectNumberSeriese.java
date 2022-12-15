public class PrintPerfectNumberSeriese {
	public static void perfect(int num1) {
		for(int i = 1; i <= num1; i++) {
			int res = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					res = res + j;
				}
			}
				if(res == i) {
					System.out.println(res);
				}
		}
	}
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		perfect(num);
	}
}