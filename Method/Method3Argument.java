public class Method3Argument{
static int x=15,y=7;

	public static void add(int a, int b){
	
	int c=a+b;		
	System.out.println("Addition="+c);	

	}
	public static void sub(int a1, int b1){
		
	int c1=a1-b1;	
	System.out.println("Subtraction="+c1);

	}


public static void main(String[] args){

add(x,y);	
sub(x,y);
}
}