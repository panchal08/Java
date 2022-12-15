public class SumOfEvenNum {
	public static void main(String[] args) {
		int even = 0;
		for(int num = 1; num <= 100; num++)
			if(num % 2 == 0)
				even = even + num;
		System.out.println(even);	
	}
}