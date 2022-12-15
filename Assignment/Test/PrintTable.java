public class PrintTable {
	public static void main(String[] args) {
		int num = 1;
		int i = 1;
		while(num < 11) {
			while(i < 11) {
				System.out.println(num+"X"+i+"="+(num*i));
				i++;
			}
			System.out.println();
			i = 1;
			num++;
		}
		for(int n = 1; n < 11; n++) {
			for(int j = 1; j < 11; j++)
				System.out.println(n+"X"+j+"="+(n*j));
			System.out.println();
		}
	}
}