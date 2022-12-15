public class SumOfOddNum {
	public static void main(String[] args) {
		int odd = 0;
		for(int num = 1; num <= 100; num++)
			if(num % 2 != 0)
				odd = odd + num;
		System.out.println(odd);
	}
}