import java.util.Scanner;
public class SumOfPrime {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int num = 2; num <= 100; num++) {
			for (int div = 2; div <= num; div++)
				if (num % div == 0)
					count++;
			if (count == 1)
				sum = sum + num;
			count = 0;
		}
		System.out.println(sum);
	}
}