public class Cube {
	public static void main(String[] args) {
		int n = 2;
		while(n < 21) {
			System.out.println(n+"	Cube	:"+(n*n*n));
			n++;
		}
		for(int i = 2; i < 21; i++)
			System.out.println(i+"	Cube	:"+(i*i*i));
	}
}