public class TestShape {
	public static void main(String[] args) {
		int borderWidth1 = Integer.parseInt(args[0]);
		String color1 = args[1];
		Shape s = new Shape();
		Shape s1 = new Shape(borderWidth1,color1);
	}
}