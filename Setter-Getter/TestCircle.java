public class TestCircle {

	public static void main(String[] args) {
	
		Circle c = new Circle();
			c.setBorderWidth(20);
			c.setColor("blue");
			c.setRadius(1.9);
			System.out.println("BorderWidth = "+c.getBorderWidth());
			System.out.println("Color = "+c.getColor());
			System.out.println("Radius = "+c.getRadius());
			System.out.println("Area = "+c.getArea());
			System.out.println("Circumference = "+c.getCircumference());
	}
}