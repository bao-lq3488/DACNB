import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
	Connection connection = null;
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String serverName = "127.0.0.1"; 
	String portNumber = "1521";
	String sid = "xe";
	String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid; 
	String username = "QLSV"; 
	String password = "12345";

	public ConnectionJDBC() {
	}

	public boolean doConnection() {
		try {
			Class.forName(driverName);
			
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			
			System.out.println("ClassNotFoundException : " + e.getMessage());
			return false;
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static void main(String arg[]) {
		ConnectionJDBC con = new ConnectionJDBC();
		System.out.println("Connection : " + con.doConnection());
	}
}
