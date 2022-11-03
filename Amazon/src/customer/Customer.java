package customer;

public class Customer {
	
	// Attributes
	public String firstName;
	public String lastName;
	public long phone;
	public String email;
	
	// Methods
	public void purchaseItem() {
		System.out.println("Your purchase has been placed.");
	}
	
	public void returnItem() {
		System.out.println("Your item has been returned.");
	}
	
}
