package interfaces;

public class Execution {
	public static void main(String[] args) {
		
		Person person = new Employee();
		person.doSomething();
		
		Doctor doctor = new Employee();
		doctor.doctorMethod();
		
		Lawyer lawyer = new Employee();
		lawyer.lawyerMethod();
		
		Programmer programmer = new Employee();
		programmer.programmerMethod();
		 
	}
}
