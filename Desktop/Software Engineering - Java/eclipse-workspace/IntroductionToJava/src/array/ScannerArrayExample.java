package array;

import java.util.Scanner;

public class ScannerArrayExample {
	public static void main(String[] args) {
		
		String[] city = new String[5];
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter names of cities: "); 	// Accept the value
		for(int i = 0; i < city.length; i++) {
			city[i] = scn.next();
		}
		
		System.out.println("List of cities: "); // Prints the value
		for(int i = 0; i < city.length; i++) {
			System.out.println(city[i]);
		}

	}
}
