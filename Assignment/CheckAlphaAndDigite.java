public class CheckAlphaAndDigite {
	public static void check(String name, String number){
		for(int digit = 0; digit < name.length(); digit++) {
			char ch = name.charAt(digit);
			if(ch >= 'a' && 'z' >= ch || ch >= 'A' && 'z' >= ch || ch == ' ') {
				System.out.print(ch);
			} else {
				System.out.println();
				System.out.println("Only Accpte Alphabetic");
				digit = name.length();
			}
		}
		for(int digit = 0; digit < number.length(); digit++) {
			char num = number.charAt(digit);
			if(num >= 48 && 57 >= num) {
				System.out.print(num);
			} else {
				System.out.println();
				System.out.println("Only Accpte Numeric Value");
				digit = number.length();
			}
		}
	}
	public static void main(String[] args){
		try{
			String nam = args[0];
			String num = args[1];
			check(nam,num);
		} catch(ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("Please Enter Data");
		}
	}
}