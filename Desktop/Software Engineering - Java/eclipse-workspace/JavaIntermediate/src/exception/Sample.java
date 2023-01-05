package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
	public static void main(String[] args) {
		
		try {
			int x = 10; // ArithmeticException
			int y = 2;
			int z = x/y;
			
			int[] nums = new int[5]; // ArrayIndexOutOfBoundsException
			nums[4] = 200;
			
			Connection con = DriverManager.getConnection("", "", ""); // SQLException
 			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("This is a arithmetic exception!");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("This is a array index out of bounds exception!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Could not connect to database!");
		}

		/* Exception error's 
		 * 
		 * 1. Syntax error
		 * 2. Logical error
		 * 3. Red line error
		 * */
		
	}
}
