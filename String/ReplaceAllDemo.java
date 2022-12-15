public class ReplaceAllDemo {
	public static void check(String str1, String ch) {
		System.out.println(str1.replaceAll(ch,"*"));	
	}
	public static void main(String[] args) {
		String str = args[0];
		String ch = args[1];
		check(str,ch);
	}
}