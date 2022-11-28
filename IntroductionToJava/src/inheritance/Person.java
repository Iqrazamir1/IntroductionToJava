package inheritance;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void personTalking() {
		System.out.println("Person constructor");
	}
	
	public void doSomething() {
		System.out.println("People do somsething to make a living.");
	}
}
