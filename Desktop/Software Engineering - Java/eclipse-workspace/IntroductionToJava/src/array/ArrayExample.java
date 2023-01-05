package array;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] student; // Declare
		student = new String[5]; // Instantiate
		student[0] = "Hilda"; // Initialise
		student[1] = "Iqra";
		student[2] = "Ibrahim";
		student[3] = "Hamza";
		student[4] = "Uzma";
		for(int i = 0; i < student.length; i++) {
			System.out.println("students: " + student[i]);
		}
		
		// Simpler example
		String[] fruits = {"Banana", "Apple", "Grapes", "Guava", "Pineapple", "Avacado"}; 
		for(int i = 0; i < fruits.length; i++) {
			System.out.println("Fruits: " + fruits[i]);
		}
		
		// Integer example
		int[] zipcode = {123, 456, 789, 743, 924, 924, 839}; 
		for(int i = 0; i < zipcode.length; i++) {
			System.out.println("zipcode: " + zipcode[i]);
		}

	}
}
