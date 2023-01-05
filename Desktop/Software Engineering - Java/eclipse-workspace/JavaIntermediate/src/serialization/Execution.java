package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Execution {
	public static void main(String[] args) {
		
		Product prod = new Product(1001, "Laptop", 1500, "Apple");
		
		try {
			/* Write operation
			 * */
			FileOutputStream fileOut = new FileOutputStream("Object.txt"); // To create a file
			ObjectOutputStream oOut = new ObjectOutputStream(fileOut); // To convert object into stream of bytes
			oOut.writeObject(prod); // To write into the file
			
			/* Read operation
			 * */
			FileInputStream fileIn = new FileInputStream("Object.txt");
			ObjectInputStream oIn = new ObjectInputStream(fileIn); // To convert bytes to object
			Product prodCopy = (Product)oIn.readObject();
			System.out.println(prodCopy.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.price);
			System.out.println(prodCopy.brand);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
