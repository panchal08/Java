public class ChangeUpperCaseToLowerCaseAndLowerCaseToUpperCase {
	public static void check(String str1) {
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch >= 'a' && 'z' >= ch) {
				String str = String.valueOf(ch);
				System.out.print(str.toUpperCase());
			} else if(ch >= 'A' && 'Z' >= ch) {
				String str = String.valueOf(ch);
				System.out.print(str.toLowerCase());
			} else {
				System.out.print(" ");
			}
		}
	}
	public static void main(String[] args) {
		String str =  args[0];
		check(str);	
	}
}