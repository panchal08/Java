public class CheckStringIsEmptyOrNot {
	public static void check(String str1) {
		if(str1.isEmpty()) {
			System.out.println("String is Empty");
		} else {
			System.out.println("String is not Empty");
		}	
	}
	public static void main(String[] args) {
		String str = args[0];
		check(str);
	}
}