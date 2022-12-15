public class TestShape {

	public static void main(String[] args) {
	
		Shape s = new Shape();
			s.setBorderWidth(30);
			s.setColor("red");
			System.out.println(s.getBorderWidth());
			System.out.println(s.getColor());
	}
}