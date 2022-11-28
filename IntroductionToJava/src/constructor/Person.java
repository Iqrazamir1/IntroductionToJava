 package constructor;

public class Person {
	String name; // Attributes
	int age;
	String address;
	int phone;
	
	public Person() { // Constructor
		System.out.println("This is an example of a constructor");
	}
	
	public Person(String name, int age, String address, int phone) { // Constructor
		name = name;
		
		if(age <= 0) { // Can put constraints using constructor
			System.out.println("Age can not be less than 0");
		} else {
			age = age;
		}
		
		address = address;
		phone = phone;
		
	}
}
