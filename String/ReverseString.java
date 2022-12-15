public class ReverseString {
	
	public static void reverse(String str1) {
		System.out.println("\tYour String is : "+str1);
		int length = str1.length();
		System.out.println("\n\tLength of String : "+length);
		System.out.print("\n\tReverse String is : ");
		
		for(int i = length-1; i >= 0; i-- ){
			
			System.out.print(str1.charAt(i));
		}
	}

	public static void main(String[] args) {

		String str = args[0];
		reverse(str);
	}
}