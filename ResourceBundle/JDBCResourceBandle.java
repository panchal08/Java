import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
public class JDBCResourceBandle {
	public static void main(String[] args) {
		try {
			ResourceBundle rb = ResourceBundle.getBundle("source");
			Class.forName(rb.getString("driver"));
			Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"), rb.getString("pwd"));
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			System.out.println(rb.getString("str"));
			while(rs.next()) System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"		"+rs.getString(3));
			con.close();
			stmt.close();
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
	}
}