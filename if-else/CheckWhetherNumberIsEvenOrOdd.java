public class CheckWhetherNumberIsEvenOrOdd {

	public static void Check(int num1) {
	
		if(num1 % 2 == 0){
			System.out.println(num1+" is Even");
		}else{
			System.out.println(num1+" is Odd");
		}
	}
	public static void main(String[] args) {
	
		int num = Integer.parseInt(args[0]);
		Check(num);
	}
}