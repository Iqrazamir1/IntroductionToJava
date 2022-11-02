package execution;

import customer.Customer;
import payment.Payment;
import product.Product;

public class Execution {
	public static void main(String[] args) {
		
		Customer object1 = new Customer();
		object1.show();
		
		Product object2 = new Product();
		object2.showProduct();
		
		Payment object3 = new Payment();
		object3.showPayment();
	}

}
