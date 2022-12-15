class Error {
	static final String SQL = "SQL Exception";
	public static void error(String error) {
		System.err.println(error);
	}
}
public class Main {
	public static void main(String[] args) {
		Error.error(Error.SQL);
	}
}