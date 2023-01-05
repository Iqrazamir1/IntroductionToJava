package conditions;

public class TestConditions {

	public static void main(String[] args) {
		
		int numberOne = 10; // Example 1
		int numberTwo = 20;

		if (numberOne > numberTwo) {
			System.out.println("Number one is bigger.");
		} else {
			System.out.println("Number two is bigger.");
		}

		int x = 10; // Example 2
		int y = 20;
		int z = 30;
		
		if (x > y && y > z) {
			System.out.println("x is bigger.");
		} else if (y > x && x > z){
			System.out.println("y is bigger.");
		} else {
			System.out.println("z is bigger.");
		}

		String city = "NewYork"; // Example 3
		
		if (city == "NewYork") {
			System.out.println("Welcome to NewYork.");
		} else {
			System.out.println("You are in somwother part of the world.");
		}
		
	}
}
