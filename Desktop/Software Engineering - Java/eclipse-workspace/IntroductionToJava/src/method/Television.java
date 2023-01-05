package method;

public class Television {
	String brand;
	int price;
	int screenSize;
	
	public void turnOn() { // Method takes nothing and returns nothing
		System.out.println("shows display");
	}

	public int switchToChannel() { // Method takes nothing and returns something(integer)
		return 1;
	}
	
	public double getDiscount() { // Method takes nothing and returns something(double)
		return (price*10/100);
	}
	
	public double discountOnBlackFriday(int dis) { // Method takes something(double) and returns something(integer)
		return (price*dis/100);
	}
	
	public double discountWithCityBank(int dis, int cityDiscount) { // Method takes something(double) and returns something(integer, integer)
		int totalDisocunt = dis + cityDiscount;
		return (price*(totalDisocunt)/100);
	}
	
}
