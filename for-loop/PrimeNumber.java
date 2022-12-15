public class PrimeNumber {
	public static void main(String[] args) {
		for(int num = 2, count = 0; num < 100; count = 0, num++) {
			for(int prime = 2; prime <= num; prime++)
				if(num % prime == 0) count++;
			if(count == 1) System.out.println(num);
}	}	}