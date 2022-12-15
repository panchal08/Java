public class CheckNumberWhetherDivisibleBy5And11 {

	public static void Check(int a) {
	
		if(a % 5 == 0) {
			if(a % 11 == 0) {
				System.out.println(a+" number is divisible by 5 and 11");
			}else{
				System.out.println(a+" number is divisible only 5");
			}
		}else{
			if(a % 11 == 0) {
				System.out.println(a+" number is divisible only 11");
			}else{
				System.out.println(a+" number is not divisible by 5 and 11");
			}
		}
	}
	
	public static void main(String[] args) {
	
		int i = Integer.parseInt(args[0]);
		Check(i);
	}
}