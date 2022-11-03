package execution;

import java.util.Scanner;

import customer.Customer;
import payment.Payment;
import product.Product;

public class Execution {
	public static void main(String[] args) {
		
		// Customer
		Customer customer1 = new Customer();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		customer1.firstName = scn.next();
		System.out.println("Please enter your last name: ");
		customer1.lastName = scn.next();
		System.out.println("Please enter your phone number: ");
		customer1.phone = scn.nextLong();
		System.out.println("Please enter your email: ");
		customer1.email = scn.next();
		
		System.out.println(customer1.firstName);
		System.out.println(customer1.lastName);
		System.out.println(customer1.phone);
		System.out.println(customer1.email);
		customer1.purchaseItem();
		customer1.returnItem();
		
		// Product
		Product product1 = new Product();
		
		product1.price = 20.50F;
		product1.id = 47384;
		product1.name = "Printer";
		product1.description = " Printers vary in size, speed, sophistication and cost.";
		
		System.out.println(product1.price);
		System.out.println(product1.id);
		System.out.println(product1.name);
		System.out.println(product1.description);
		product1.delivered();
		product1.deliveryPending();
		
	}
}
