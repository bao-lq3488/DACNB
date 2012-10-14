import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
	Connection connection = null;
	String driverName = "oracle.jdbc.driver.OracleDriver"; // for Oracle
	// String driverName = â€œcom.mysql.jdbc.Driverâ€�; //for MySql
	String serverName = "127.0.0.1"; // Use this server.
	String portNumber = "1521";
	String sid = "xe";
	String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":"
			+ sid; // for Oracle
	// uri =â€�jdbc:mysql://server ip or address:port/database nameâ€�; //for Mysql
	String username = "QLSV"; // You should modify this.
	String password = "12345"; // You should modify this.

	public ConnectionJDBC() {
	}

	public boolean doConnection() {
		try {
			// Load the JDBC driver
			Class.forName(driverName);
			// Create a connection to the database
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// Could not find the database driver
			System.out.println("ClassNotFoundException : " + e.getMessage());
			return false;
		} catch (SQLException e) {
			// Could not connect to the database
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
