public class Demo {

	public void m1(int a) {
		System.out.println("This is int argument");
	}
	public int m1(double d) {
		System.out.println("This is double argument");
		return 1;
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.m1(10);
		d.m1(1.5);
		d.m1(10.5f);
		d.m1('a');
	}
}