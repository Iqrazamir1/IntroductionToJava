package collection;

public class Product {
	String name; // Attributes
	String brand;
	int price;
	int quantity;
	
	public Product(String name, String brand, int price, int quantity) { // Constructor using fields
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() { // Constructor without using fields
		super();
	}

	@Override // To string
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
