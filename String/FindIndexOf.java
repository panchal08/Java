public class FindIndexOf {
	public static void check(String str1, String ch1) {
		System.out.println(str1.indexOf(ch1));	
	}
	public static void main(String[] args) {
		String str = args[0];
		String ch = args[1];
		check(str,ch);
	}
}	