public class VarArgsTest {
	public static void sum(int... x) {
		int sum = 0;
		if(x.length != 0) {
			for(int i = 0; i < x.length; i++) {
				sum = sum + x[i];
			}
			System.out.println("Addition : "+sum);
		} else {
			System.out.println("This is var-arg method");
		}
	}
	public static void main(String[] args) {
		sum();
		sum(10);
		sum(10,20,30);
		sum(10,20,30,40,50);
	}
}