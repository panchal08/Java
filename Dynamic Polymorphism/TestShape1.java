class Shape {
	private String color = null;
	private int borderWidth = 0;

	public Shape() {
	
	}

	public Shape(int borderWidth, String color) {
		this.borderWidth = borderWidth;
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public String getColor() {
		return color;
	}

	public double area()  {
		return 0.0;
	} 
}
class Circle extends Shape {
	private double radius = 0.0;
	
	public Circle() {

	}
	
	public Circle(int borderWidth, String color, double radius) {
		super(borderWidth, color);
		this.radius = radius;
	}

	public double area() {
		return(3.14 * radius * radius);
	}
}
public class TestShape1 {
	public static void main(String[] args) {
		Circle c = new Circle(10 , "red", 2.5);
		System.out.println(c.getColor()+" , "+c.getBorderWidth());
		double d = c.area();
		System.out.println(d);
	}
}