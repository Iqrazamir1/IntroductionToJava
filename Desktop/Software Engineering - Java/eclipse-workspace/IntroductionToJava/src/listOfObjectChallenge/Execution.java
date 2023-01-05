package listOfObjectChallenge;

import java.util.ArrayList;

public class Execution {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Upsana", 32, "Trainer"));
		list.add(new Person("Hilda", 22, "Manager"));
		list.add(new Person("Kev", 23, "Team leader"));
		list.add(new Person("Arifi", 20, "Designer"));
		
		Person p = new Person();
		p.getPerson(list);
		
	}
}
