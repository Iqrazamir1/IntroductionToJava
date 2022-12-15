package builderPattern;

public class Execution {
	public static void main(String[] args) {
		
		Product obj1 = new ProductBuilder()
				.name("TV")
				.buildProduct();
		System.out.println(obj1);
		
		Product obj2 = new ProductBuilder()
				.id(372919)
				.name("Camera")
				.buildProduct();
		System.out.println(obj2);
		
		Product obj3 = new ProductBuilder()
				.id(468896)
				.name("Speaker")
				.brand("Apple")
				.buildProduct();
		System.out.println(obj3);
		
		Product obj4 = new ProductBuilder()
				.id(468935)
				.name("Laptop")
				.brand("Samaung")
				.price(1200)
				.buildProduct();
		System.out.println(obj4);

	}
}
