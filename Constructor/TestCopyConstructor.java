public class TestCopyConstructor {
	public static void main(String[] args) {
		int borderwidth = Integer.parseInt(args[0]);
		String Color = args[1];
		CopyConstructor obj = new CopyConstructor(borderwidth, Color);
		CopyConstructor obj1=obj;
		
		System.out.println(obj);
		System.out.println(obj1);
	}
}