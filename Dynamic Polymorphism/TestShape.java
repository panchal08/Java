class Shape {
	private int borderWidth = 0;
	private String color = null;
	public Shape() {
	}
	public Shape(int borderWidth, String color) {
		this.borderWidth = borderWidth;
		this.color = color;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public double area() {
		return 0.0;
	}
}
class Circle extends Shape {
	private double radius = 0.0;
	public Circle() {
	}
	public Circle(int borderWidth, String color) {
		super(borderWidth, color);
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return (3.14 * radius * radius);
	}
	public double circumference() {
		return (2 * 3.14 * radius);
	}
}
class Rectangle extends Shape {
	private int width = 0;
	private int length = 0;
	public Rectangle() {
	}
	public Rectangle(int borderWidth, String color) {
		super(borderWidth, color);
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	public double area() {
		return (width * length);
	}	
}
class Square extends Rectangle {
	private int length = 0;
	public Square() {
	}
	public Square(int borderWidth, String color) {
		super(borderWidth, color);
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public double area() {
		return(length * length);
	}	
}
public class TestShape {
	public static void main(String [] args) {
		Shape s = new Shape();
	}
}