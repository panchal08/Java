//com.jdbc.project;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class Connect {
	private static Connection con = null;
	public static Connection getCon() {
		try{
			ResourceBundle rb = ResourceBundle.getBundle("Source");
			Class.forName(rb.getString("driver"));
			con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"), rb.getString("pwd"));
			return con;
		} catch(ClassNotFoundException e) {
			Error.error(Error.cnfe);
		} catch(SQLException e) {
			Error.error(Error.sqle);
		}
		return con;
	}
}