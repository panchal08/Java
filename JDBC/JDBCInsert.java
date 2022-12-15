import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name	: ");
		String name = sc.nextLine();
		System.out.print("Enter contact number	: ");
		String contact = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate("insert into student (name, contact) values('"+name+"', '"+contact+"')");
			con.close();
			stmt.close();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();	
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}