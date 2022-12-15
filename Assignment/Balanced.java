class Test implements Cloneable {
	int a = 0;
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Balanced { 
	public static void main(String[] args) throws CloneNotSupportedException {
		Test t = new Test();
		Test t1 = (Test)t.clone();
		t.a = 99;
		t1.a = 123;
		System.out.println(t.a);
		System.out.println(t1.a);
	}
}