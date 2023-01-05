package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName = "root";
			String password = "Football1";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected successfully");
		} catch (Exception e) {
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
		}

	}
}
 