package scanner;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scn.next();
		
		System.out.println("Please enter your year of birth: ");
		int yearOfBirth = scn.nextInt();
		
		System.out.println("Hello " + name + "" + " ,your date of birth is " +  yearOfBirth + ".");
		
	}

}
