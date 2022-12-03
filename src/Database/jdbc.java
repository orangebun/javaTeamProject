package Database;
import java.sql.*;
import java.util.*;
import java.io.*;

public class jdbc {//like it says on the tin
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		final String connectionString = "jdbc:sqlserver://idiashroud.database.windows.net:1433;database=Project;user=pleasework@idiashroud;password=GSUCIS3270!;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;" ;
		Connection connection = DriverManager.getConnection(connectionString);
		try {
			// Creating connection
			connection = DriverManager.getConnection(connectionString);
			System.out.print("It worked!!!");
	} catch (SQLException exc) {
		exc.printStackTrace();
		}
	}
	
}
