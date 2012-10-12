import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//JdbcTestOracle.java

public class TestJDBCdriver {
	  public static void main (String args[]) {
	      try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	       }
	        catch (ClassNotFoundException e) {
	            System.err.println (e) ;
	            System.exit (-1) ;
	        }
	       try {
	            // open connection to database
	           Connection connection = DriverManager.getConnection(
	             "jdbc:oracle:thin:@localhost:1521:XE",
	             "system",  // ## fill in User here
	             "Vinamilk123" // ## fill in Password here
	            );
	            // build query
	            String query = "SELECT * From DUAL" ;

	            // execute query
	            Statement statement = connection.createStatement () ;
	            ResultSet rs = statement.executeQuery (query) ;

	            while ( rs.next () )
	                System.out.println ("Oracle Query: " + rs.getString (1)) ;
	            connection.close () ;
	        }
	        catch (java.sql.SQLException e) {
	            System.err.println (e) ;
	            System.exit (-1) ;
	        }
	    }
	}

