package Mupackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {
 
	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/codingwallah";
			String userName = "root";
			String password = "Mishi@2003";

			// Connection Este

			Connection conn = DriverManager.getConnection(url, userName, password);
			// Statement create
			Statement stm = conn.createStatement();

			// query generate
			String query = "create table Student(sid int (3),sname varchar(200), semail varchar(200))";
			stm.execute(query);
			System.out.println("table Created successfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "codingwallah";
			String userName = "root";
			String password = "Mishi@2003";

			// Connection 

			Connection conn = DriverManager.getConnection(url+db, userName, password);
			// Statement create
			Statement stm = conn.createStatement();

			// query generate
			String query = "INSERT into Student VALUES (1, 'MANN','MANN@gmail.com')";
			stm.execute(query);
			System.out.println("data inserted successfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
