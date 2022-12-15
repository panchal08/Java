public class Method7{

	public static void check(char ch){
	
		if(ch>=65&&ch<=90){

		System.out.println("Character is Uppercase");

		}
		else{	if(ch>=97&&ch<=122){
			System.out.println("Character is Lowercase");
			}
			else{
			System.out.println("It is not Character");
		}
	}

}
public static void main(String[] args){

check('A');	
}
}