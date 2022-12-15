public class Method9{

	public static int check(int find){	
	int fact = 1;
	for(int i=1;i<=find;i++){
	fact=fact*i;
	}
	return fact;
}
public static void main(String[] args){
System.out.println("Factorial is ="+check(5));	
}
}