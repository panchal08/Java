public class PrimeFactores {
	public static void main(String[] args) {
		for(int i = 2; i <= 100; i++) {
			int count = 0;
			for(int j = 2; j <= i; j++)
				if(i % j == 0)
					count++;
			if(count == 1)
				for(int n = 1; n <= i; n++)
					if(i % n == 0)
						System.out.print(n+"	");
			System.out.println();
		}
	}
}