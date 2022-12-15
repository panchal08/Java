import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCCreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
			Statement stmt = con.createStatement();
			int row = stmt.executeUpdate("CREATE TABLE student (id INT AUTO_INCREMENT, name VARCHAR(50) NOT NULL, contact BIGINT NOT NULL, PRIMARY KEY(id))");
			con.close();
			stmt.close();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}