public class CheckNumberisPalindrom {

	public void palindrom(int num1) {
	
		int res = 0 ;
		int store = num1;
		for(int i = 1; i <= num1;){
			int ram = num1 % 10;
			res = (res * 10) + ram;
			num1 = num1 / 10;
			System.out.println(res);
		}
		
		if(store == res){
			System.out.println(store+" Number is palindrom");
		}else{
			System.out.println(store+" Number is not palindrom");
		}
	}
	public static void main(String[] args) {
	
		int num = Integer.parseInt(args[0]);
		CheckNumberisPalindrom obj = new CheckNumberisPalindrom();
		obj.palindrom(num);
		
	}
}