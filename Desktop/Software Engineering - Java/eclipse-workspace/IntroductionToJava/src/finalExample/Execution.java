package finalExample;

public class Execution {

	public static void main(String[] args) {
		
		Sample obj = new Sample();
		System.out.println("Final value: " + obj.x);
		System.out.println("Final constructor value: " + obj.y);
		
		Sample obj1 = new Sample(444);
		System.out.println("Final value: " + obj1.x);
		System.out.println("Final constructor value: " + obj1.y);
		
		Sample obj2 = new Sample(111, 666);
		System.out.println("Final value: " + obj2.x);
		System.out.println("Final constructor value: " + obj2.y);

	}
}
