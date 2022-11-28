package encapsulation;

public class Execution {

	public static void main(String[] args) {
		
		Mobile m = new Mobile(); 
		
		m.setBrand("Apple");	// Brand
		System.out.println(m.getBrand());
		
		m.setRAM(12);	// RAM
		System.out.println(m.getRAM());
		
		m.setColor("Red");	// Colour
		System.out.println(m.getColor());

	}
}
