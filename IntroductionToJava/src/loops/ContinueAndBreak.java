package loops;

public class ContinueAndBreak {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 2) { // Skips the number 2
				continue;
			}
			if(i == 7) { // Loop ends at number 7 
				break;
			}
			System.out.println(i);
		}
		
	}
}
