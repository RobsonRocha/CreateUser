package main.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection connection;
	
	public static Connection getConnection(){
		
		if(connection == null)
			connection = getConnectionDB();
		
		return connection;
		
	}
	
	private static Connection getConnectionDB(){
	      Connection con = null;

	      String url = "jdbc:postgresql://localhost";
	      String user = "postgres";
	      String password = "admin";
	      try {
	         con = DriverManager.getConnection(url, user, password);	         
	      } catch (SQLException ex) {
	         System.out.println(ex.getMessage());
	      }
	      finally{
	      }
	      return con;
	   }
}
