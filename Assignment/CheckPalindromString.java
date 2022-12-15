public class CheckPalindromString {
	public static void Palindrom(String str1) {
		String str2 = "";
		for(int i  = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				str2 = str2 + str1.charAt(i);
			}
		}
		String sum = ""; 
		for(int i = str2.length()-1; i >= 0; i--) {
			char ch = str2.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				sum = sum + str2.charAt(i);
			}
		}
		if(sum.equalsIgnoreCase(str2)) {
			System.out.println(str1+" , String is palindrom");
		} else  {
			System.out.println("String is not palindrom");
		}
	}
	public static void main(String[] args) {
		String str = args[0];
		Palindrom(str);
	}
}