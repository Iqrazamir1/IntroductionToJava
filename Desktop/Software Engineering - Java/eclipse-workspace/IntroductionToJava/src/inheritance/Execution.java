package inheritance;

public class Execution {

	public static void main(String[] args) {
		Person p = new Person("Iqra", 21);
		p.personTalking();
		p.doSomething();
		
		System.out.println(" "); 
		
		Employee e = new Employee("Iqra", 21, 1001);
		e.employeeTalking();
		e.doSomething();
		
		System.out.println(" "); 
		
		Manager m = new Manager("Iqra", 21, 1001, "Developer");
		m.managerTalking();
		m.doSomething();
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.employeeId);
		System.out.println(m.department);	
	}
}
