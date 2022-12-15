public class CheckNumberIsArmstrong {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		int count = 0;
		int store = num;
		int num1 = num;
		int res = 1;
		while(store!=0) {
			store=store/10;
			count++;
		}
		//for(int i = 0; i < num;) {
			while(num !=0) {
			int rom = num % 10;
			for(int j = 0; j < count; j++) {
				res = res * rom;
			}
			sum = sum + res;
			res = 1;
			num = num/10;
		}
		if(num1 == sum){
			System.out.println(num1+" number is armstorng");
		}else{
			System.out.println(num1+" number is not armstorng");
		}
	}
} 