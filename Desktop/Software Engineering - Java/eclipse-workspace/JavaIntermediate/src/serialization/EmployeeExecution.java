package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeExecution {
	public static void main(String[] args) {
		
		Employee employee = new Employee(1001, "Iqra", 15000, "Iqra@outlook.com");
		
		try {
			/* Write operation
			 * */
			FileOutputStream fileOut = new FileOutputStream("Employee.txt"); // To create a file
			ObjectOutputStream oOut = new ObjectOutputStream(fileOut); // To convert object into stream of bytes
			oOut.writeObject(employee); // To write into the file
			
			/* Read operation
			 * */
			FileInputStream fileIn = new FileInputStream("Employee.txt");
			ObjectInputStream oIn = new ObjectInputStream(fileIn); // To convert bytes to object
			Employee employeeCopy = (Employee)oIn.readObject();
			System.out.println(employeeCopy.employeeId);
			System.out.println(employeeCopy.name);
			System.out.println(employeeCopy.salary);
			System.out.println(employeeCopy.email);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
