public class PrintEven {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100) {
			if(i % 2 == 0)
				System.out.print(i+"	");
			i++;
		}
		for(int n = 1; n <= 100; n++)
			if(n % 2 == 0)
				System.out.print(n+"	");
	}
}