package conditions;

import java.util.Scanner;

public class Challenge {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scn.next();
		
		System.out.println("Please enter your city: ");
		String city = scn.next();
		
		if (city.equals("London")) {
			System.out.println("Hello " + name + " you are British.");
		} else if (city.equals("NewYork")) {
			System.out.println("Hello " + name + " you are a Newyorker."); 
		} else {
			System.out.println("Hello " + name + " you are from somwhere else."); 
		}
		
		String x = "Iqra"; // ---> When a string is created it is allocated a memory which may be 0001 (this is where Iqra is stored) String object 1
		x = "Hello " + x; // ---> 0002 String object 2
		x = x + " how are you?"; // ---> 0003 String object 3
		System.out.println(x);
	}
}
