public class CheckNumberIsPrime {

	public static void main(String[] args) {
	
		int num = Integer.parseInt(args[0]);
		int count=0;
		for(int i = 1; i < num; i++ ) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println(num+" is prime");
		}else{
			System.out.println(num+" is not prime");
		}
	}
}