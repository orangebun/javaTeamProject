package Database;
import java.sql.*;
import java.util.*;
 
//tries to connect to database

public class ConnectionCheck {
	public static Connection getConnection() throws Exception{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3306","root","root");
		return connection;
		}catch(Exception e) {
			System.out.print(e);
		}
		return null;
	}
	
}



