package loops;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		int x = 0; 	// Do something while a condition is true 
		
		do {
			System.out.println("Hello ---" + x + " times.");
			x++;
		} while (x <= 10);
		System.out.println("End of program.");
		
	}

}
