package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecords {
public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName = "root";
			String password = "Football1";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected successfully");
			
			// Delete data in the table 
			String query = "update customer set phone = 45647885 where id = 103";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One record updated successfully!");

		} catch (Exception e) {
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
		}
 
	}
}
