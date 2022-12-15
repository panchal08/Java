public class Square {
	public static void main(String[] args) {
		int n = 2;
		while(n < 21) {
			System.out.println(n+"	Square	:"+(n*n));
			n++;
		}
		for(int i = 2; i < 21; i++)
			System.out.println(i+"	Square	:"+(i*i));
	}
}