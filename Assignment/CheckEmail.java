public class CheckEmail {

	public static void Check(String str1) {
		String rev = "";
		String check = "";
		String str2 = "";
		for(int i = str1.length()-1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		System.out.println(rev);
		for(int i = 0; i < 10; i++) {
			check = rev.charAt(i) + check;
		}
		if(check.equals("@gmail.com")) {
			for(int i = 0; i < str1.length(); i++) {
				char ch = str1.charAt(i);
				if(ch >= 'a' && 'z' <= ch || ch >= 'A' && 'Z' <= ch || ch >= 48 && 56 <= ch) {
					System.out.print(ch);
				} else {
					i = 100;
				}
			}
		}
	}

	public static void main(String[] args) {
	
		String str = args[0];
		Check(str);
	}
}