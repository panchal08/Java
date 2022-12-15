class Parent {
	public void m1() {
		System.out.println("This is parent class");
	}
}
class Child extends Parent {
	public void m2() {
		System.out.println("This is child class");
	}
}
public class ParentCanKeepChildReferens {
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
		Child c = (Child)p;
		c.m2();
	}
}