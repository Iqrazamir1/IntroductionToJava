package exception;

public class ShoppingExecution {
	public static void main(String[] args) {
		
		Shopping obj1 = new Shopping();
		 
		obj1.addToCart();
		
		try {
			obj1.makePayment();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
