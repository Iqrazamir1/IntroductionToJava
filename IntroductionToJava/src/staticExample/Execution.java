package staticExample;

public class Execution {

	public static void main(String[] args) {
		
		Sample obj1 = new Sample(); // Employee 1
		obj1.name = "Iqra";
		obj1.socialSecurityNumber = 437829;
		obj1.salary = 21;
		
		System.out.println("Name of organisation: " + Sample.nameOfOrganization);		
		System.out.println("Name: " + obj1.name);
		System.out.println("Social security number: " + obj1.socialSecurityNumber);
		System.out.println("Salary: " + obj1.salary);
		
		Sample obj2 = new Sample(); // Employee 2
		obj2.name = "Hamza";
		obj2.socialSecurityNumber = 473929;
		obj2.salary = 25;
		
		System.out.println(" ");
		System.out.println("Name of organisation: " + Sample.nameOfOrganization);		
		System.out.println("Name: " + obj2.name);
		System.out.println("Social security number: " + obj2.socialSecurityNumber);
		System.out.println("Salary: " + obj2.salary);

	}
}
