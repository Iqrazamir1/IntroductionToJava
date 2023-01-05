package encapsulation;

public class Mobile {
	private String brand;
	private int RAM;
	private String color;
	
	public String getBrand() {	// Brand
		return brand;
	}

	public void setBrand(String brand) {
		switch (brand) {
		case "Apple":
			this.brand = brand;
			break;
		case "Samsung":
			this.brand = brand;
			break;
		case "Song":
			this.brand = brand;
			break;
		default:
			System.out.println("Not a valid brand");
		}
	}
	
	public int getRAM() {	// RAM
		return RAM;
	}
	
	public void setRAM(int RAM) {
		if(RAM > 12) {
			System.out.println("Invalid RAM size");
		} else {
			this.RAM = RAM;
		}
	}
	
	public String getColor() {	// Colour
		return color;
	}
	
	public void setColor(String color) {
		switch (color) {
		case "Black":
			this.color = color;
			break;
		case "Grey":
			this.color = color;
			break;
		case "Red":
			this.color = color;
			break;
		default:
			System.out.println("Not a valid colour");
		}	
	}
	
}
