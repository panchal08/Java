public class UseSuperKeyword extends CallAnatherConstructor {

	private String subject = null;
	private int roll = 0; 
	public UseSuperKeyword() {
		System.out.println("This is default Constructor of Cheld Class");
	}
	public UseSuperKeyword(String subject, int roll) {
		super("Shubham","Panchal");
		this.subject = subject;
		this.roll  = roll;
		System.out.println("This is two parameterizied Constructor of Cheld Class");
	}
	public static void main(String[] args) {

		UseSuperKeyword usk = new UseSuperKeyword();
		UseSuperKeyword usk2 = new UseSuperKeyword("Computer Science", 1234);
	}
}