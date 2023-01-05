package constructor;

public class Execution {

	public static void main(String[] args) {
		Person p1 = new Person(); 
		p1.name = "Irqa";
		p1.age = 21;
		p1.address = "Heywood";
		p1.phone = 329482;
		
		// Example of creating a person object using a constructor
		Person p2 = new Person("Hilda", 25, "UK", 372042); 
		Person p3 = new Person("Hamza", 0, "USA", 384294);
		Person p4 = new Person("Ibrahim", 16, "America", 3890243);

	}
}
