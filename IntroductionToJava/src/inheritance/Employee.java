package inheritance;

public class Employee extends Person {
	int employeeId;
	
	public Employee(String name, int age, int employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}
	
	public void employeeTalking() {
		System.out.println("Employee constructor");
	}
	
	public void doSomething() {
		System.out.println("Employees work to earn their salary.");
	}
}
