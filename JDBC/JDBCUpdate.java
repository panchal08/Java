import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name	: ");
		String name = sc.nextLine();
		System.out.print("Enter contact number	: ");
		String contact = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root", "root");
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate("UPDATE student set name = '"+name+"', contact ='"+contact+"' where id = 11002");
			con.close();
			con.close();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}