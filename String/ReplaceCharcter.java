public class ReplaceCharcter {
	public static void check(String str1) {
		System.out.println(str1.replace('a','*'));
	}
	public static void main(String[] args) {
		String str = args[0];
		check(str);
	}
}