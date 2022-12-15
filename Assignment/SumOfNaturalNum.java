public class SumOfNaturalNum {
	public static void main(String[] args) {
		int count = 0;
		for(int num = 1; num <= 100; num++)
			count = count + num;
		System.out.println(count);
	}
}