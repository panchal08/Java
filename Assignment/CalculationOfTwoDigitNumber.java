public class CalculationOfTwoDigitNumber {
	
	public static void cal(int a1, int opt1, int b1) {
		
		if(opt1 == 43) {	
			System.out.println(a1 + b1);
		}
		if(opt1 == 45) {	
			System.out.println(a1 - b1);
		}
		if(opt1 == 42) {	
			System.out.println(a1 * b1);
		}
		if(opt1 == 47) {	
			System.out.println(a1 / b1);
		}
		if(opt1 == 37) {	
			System.out.println(a1 % b1);
		}
	}

	public static void main(String[] args) {
	
		int a = Integer.parseInt(args[0]);
		char opt = args[1].charAt(1);
		int b = Integer.parseInt(args[2]);
		int ascii = opt;
		cal(a, ascii, b);
		
	}
}