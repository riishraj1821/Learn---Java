package pk1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pro1 {

	public static void main(String[] args) {
		//connection built
		final String URL="jdbc:mysql://localhost/javadb"; // Connection URL
//		final String URL="jdbc:mysql://127.0.0.1";
//		final String URl="jdbc:mysql://";
		final String ID = "Gourav";
		final String PASS = 
		
		try {
		Connection cnn = DriverManager.getConnection(URL,ID,PASS);
		
		
		//Statement Build
		
		Statement stm = cnn.createStatement();
		
		//Execute Query
		 ResultSet rs =stm.executeQuery("select rollno,name from result");
		 
		 while(rs.next()) {
			 int rollno =rs.getInt();
			 String name = rs.getString();
			 System.out.println();
		 }
		 
		 
		}
		catch(SQLException e) {
			System.err.println("Connection Error: " + e.getMessage());
		}
		
		System.out.println("Done.....");
	}

}
