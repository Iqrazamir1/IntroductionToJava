package typeCasting;

public class Execution {

	public static void main(String[] args) {
		
		/* Type casting is converting one 
		 * data type to another.
		 * */
		
		int a = (int) 5.6;
		System.out.println(a);
		
		char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
	}
}
