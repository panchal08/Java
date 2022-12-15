interface Operation {
	public abstract void addition(int a, int b);
	public abstract void subtraction(int a, int b);
	public abstract void multiplecation(int a, int b);
}
class Solution implements Operation {
	public void addition(int a, int b) {
		System.out.println(a + b);
	}
	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}
	public void multiplecation(int a, int b) {
		System.out.println(a * b);
	}
}
public class TestInterface {
	public static void main(String[] args) {
		Solution s = new Solution();
		s.addition(2, 4);
		s.subtraction(8, 5);
		s.multiplecation(3, 6);
	}
}