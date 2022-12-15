public class SumPrime {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i <= 100; i++) {
			int count = 0;
			for(int j = 2; j <= i; j++)
				if(i % j == 0)
					count++;
			if(count == 1)
				sum = sum + i;
		}
		System.out.println(sum);
	}
}