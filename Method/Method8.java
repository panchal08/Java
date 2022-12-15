public class Method8{

	public static int check(int cub){
	
	int res=0;
	for(int i=1;i<=cub;i++){
	res=i*i*i;
	}
	return res;
}
public static void main(String[] args){

System.out.println("Cube is ="+check(4));	
}
}