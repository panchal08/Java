import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class JDBCPSInsert {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("insert into student(name, contact) values(?,?)");
			pstmt.setString(1, "Iliyas Shaikh");
			pstmt.setString(2, "8945856673");
			pstmt.executeUpdate();
			System.out.println("Inserted");
			con.close();
			pstmt.close();
			
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}