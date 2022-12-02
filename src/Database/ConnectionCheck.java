package Database;
import java.sql.*;
import java.util.ArrayList;
 
//checks against the database for passwords & usernames and flights

public class ConnectionCheck {
	public static void main(String[] args)
			throws SQLException, ClassNotFoundException {
		//Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//Connect to the database!!
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaAir", "root", "root");
			System.out.println("Database Connected!");
		
		//connection.close();
	}	
	
}
