package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnotherSample {
	public static void main(String[] args) {
		try {
			int x = 10; // ArithmeticException
			int y = 2;
			int z = x/y;
			
			int[] nums = new int[5]; // ArrayIndexOutOfBoundsException
			nums[4] = 200;
			
			Connection con = DriverManager.getConnection("", "", ""); // SQLException
 			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error!");
		} finally {
			System.out.println("I will always get executed");
		}

	}
}
