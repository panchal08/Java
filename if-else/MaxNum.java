public class MaxNum {
	public static int compare(int num1, int num2) {
		if(num1 > num2)
			return num1;
		else if(num1 < num2)
			return num2;
		else
			return 0;
	}
	public static void main(String[] args) {
		System.out.println(compare(3,4));
	}
}