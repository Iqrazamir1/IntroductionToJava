package inheritance;

public class Manager extends Employee{
	String department;
	
	public Manager(String name, int age, int employeeId, String department) {
		super(name, age, employeeId);
		this.department = department;
	}
	
	public void managerTalking() {
		System.out.println("Manager constructor");
	}
	
	public void doSomething() {
		System.out.println("Managers manage their respective department.");
	}
}
