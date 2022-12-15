import java.util.ArrayList;
public class TestArrayListSpecialMethod extends java.util.ArrayList {
	public static void arrayListMethod() {
		ArrayList al = new TestArrayListSpecialMethod();
		TestArrayListSpecialMethod talsm = (TestArrayListSpecialMethod)al;
			talsm.add(10);
			talsm.add(20);
			talsm.add(30);
			talsm.add(40);
			talsm.add(50);
			System.out.println(talsm);
			Object copy = talsm.clone();
			System.out.println(copy);
			talsm.removeRange(1,3);
			System.out.println(talsm);
	}
	public static void main(String[] args) {
		arrayListMethod();
	}
}