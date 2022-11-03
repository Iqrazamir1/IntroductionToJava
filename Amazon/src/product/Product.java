package product;

public class Product {

	// Attributes
	public float price;
	public int id;
	public String name;
	public String description;
	
	// Methods
	public void delivered() {
		System.out.println("Your item has been delivered.");
	}
	
	public void deliveryPending() {
		System.out.println("Your delivery is pending.");
	}
	
}
