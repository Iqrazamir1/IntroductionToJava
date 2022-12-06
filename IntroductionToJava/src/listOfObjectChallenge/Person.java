package listOfObjectChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public void getPerson(ArrayList<Person> people) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter job title to be searched: ");
		String jTitle = scn.next();
		
		for(int i = 0; i < people.size(); i++) {
			if(people.get(i).jobTitle.equals(jTitle))
				System.out.println(people.get(i));
		}
	}
	
	// Constructor with fields 
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	// Constructor without fields 
	public Person() {
		super();
	}
	
	// Getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	// toString method
	@Override
	public String toString() {
		return "[name=" + name + " \n age=" + age + " \n jobTitle=" + jobTitle + "]";
	}
	
}
