package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	public int employeeId;
	public String name;
	public int salary;
	public String email;
	
	public Employee(int employeeId, String name, int salary, String email) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	
}
