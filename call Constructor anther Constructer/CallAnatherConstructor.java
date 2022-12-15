public class CallAnatherConstructor{

	private String firstname = null;
	private String lastname = null;
	private String address = null;

	public CallAnatherConstructor() {
		System.out.println("This is default Constructor of Perent Class");	
	}
	public CallAnatherConstructor(String firstname, String lastname) {

		this();
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("This is two parameterizied Constructor of Perent Class"); 
	} 
	public CallAnatherConstructor(String firstname, String lastname, String address) {
	
		this(firstname,lastname);
		this.address = address;
		System.out.println("This is three parameterizied Constructor of Perent Class");
	}
	public static void main(String[] args) {
	 
		CallAnatherConstructor cac = new CallAnatherConstructor();
		CallAnatherConstructor cac2 = new CallAnatherConstructor ("Shubham","Panchal");
		CallAnatherConstructor cac3 = new CallAnatherConstructor("Shubham","Panchal","Indore");
	}
}