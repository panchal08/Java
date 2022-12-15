public class CheckWhetherYearIsLeapYearOrNot {

	public static void Check(int year1) {
	
		if(year1 % 4 == 0){
			System.out.println(year1+" is Leap year");
		}else{
			System.out.println(year1+" is not Leap year");
		}
	}

	public static void main(String[] args) {
		
		int year = Integer.parseInt(args[0]);
		Check(year);
	}
}