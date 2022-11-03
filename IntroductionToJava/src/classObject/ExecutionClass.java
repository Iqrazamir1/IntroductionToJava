package classObject;

import java.util.Scanner;

public class ExecutionClass {
	
	public static void main(String[] args) {
		
		// Hard-coded version
		Book book1 = new Book();
		
		book1.title = "Tell me your dreams";
		book1.author = "Sidney Sheldon";
		book1.price = 15.50F;
		book1.publisher = "XYZ publishing";
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.price);
		System.out.println(book1.publisher);
		book1.print();
		
		
		// Scanner version - Not hard-coded
		Book book2 = new Book();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter book title: ");
		book2.title = scn.next();
		System.out.println("Enter book author: ");
		book2.author = scn.next();
		System.out.println("Enter book price: ");
		book2.price = scn.nextFloat();
		System.out.println("Enter book publisher: ");
		book2.publisher = scn.next();

		System.out.println(book2.title);
		System.out.println(book2.author);
		System.out.println(book2.price);
		System.out.println(book2.publisher);
		book2.print();
	}

}
