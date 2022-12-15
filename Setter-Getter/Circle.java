public class Circle {

	private int borderWidth = 0;
	private String color = null;
	private double radius= 0.0;
	
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
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public double getCircumference() {
		double circumference = 2 * 3.14 * radius;
		return circumference;
	}
}