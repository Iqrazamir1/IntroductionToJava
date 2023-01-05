package abstraction;

public class Execution {

	public static void main(String[] args) {
		
		Iphone obj = new Iphone();
		show(obj);
		
		Samsung obj1 = new Samsung();
		display(obj1);
	}

	private static void show(Iphone obj) {
		obj.showConfig();
	}
	
	private static void display(Samsung obj1) {
		obj1.showConfig();
	}

}
