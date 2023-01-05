package singletonDesignPattern;

public class Sample {
	private static Sample x;
	
	private Sample() {}
	
	public static Sample getObjectOfSample() {
		if(x == null) {
			x = new Sample();
		}
		return x;
	}
	
	public void helloMethod() {
		System.out.println("Hello!");
	}

	public void hiMethod() {
		System.out.println("Hi!");
	}
}
