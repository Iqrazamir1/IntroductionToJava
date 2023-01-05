package interfaces;

public class Employee extends Person implements Doctor, Lawyer{
	
	public void doSomething() {
		System.out.println("doSomething method from employee class.");
	}
	
	public void doctorMethod() {
		System.out.println("Doctor method.");
	}
	
	public void lawyerMethod() {
		System.out.println("Lawyer method.");
	}

	public void programmerMethod() {
		System.out.println("Programmer method.");
	}
	
}
