package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecords {
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName = "root";
			String password = "Football1";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected successfully");
			
			// Inserting data into the database table 
			String query = "insert into customer values(104, 'Uzma', 4839223, 'U@outlook.com')";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One record inserted successfully!");

		} catch (Exception e) {
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
		}
 
	}
}
