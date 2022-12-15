//com.jdbc.project
public class Error {
	final static String cnfe = "Driver not Loaded...!";
	final static String sqle = "Something Went Wrong....! Connection not established";
	final static String pnfe = "404 Page Not Found...!";
	final static String npe = "Please Enter valid option number";
	final static String mte = "You tryed maximun time...! Thank you for using";
	public static void error(String error) {
		System.out.println("\n	"+error);
	}
}