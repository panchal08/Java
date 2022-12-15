public class CopyConstructor {
	private int borderWidth = 0;
	private String color = null;

	public CopyConstructor(int borderWidth, String color) {
		this.borderWidth = borderWidth;
		this.color  = color;
	}
	public CopyConstructor(CopyConstructor cc) {
		this.borderWidth = cc.borderWidth;
		this.color = cc.color;
	}
	public void display() {
		System.out.println(borderWidth+" "+color);
	}
}