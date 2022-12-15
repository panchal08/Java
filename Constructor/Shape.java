public class Shape {

	private int borderWidth = 0;
	private String color = null;
	public Shape()  {
		System.out.println("This is default Constructor");
	}
	public Shape(int borderWidth, String color) {
		this. borderWidth = borderWidth;
		this. color = color;
		System.out.println("This is parameterizes Constructor");
	}
}