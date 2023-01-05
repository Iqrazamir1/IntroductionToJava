package stringManipulation;

public class StringExample {

	public static void main(String[] args) {
		String name = "Iqra"; // ---> 0001 (memory location)
		name = "Hello " + name; // ---> 0002 (memory location)
		name = name + " how are you?"; // ---> 0003 (memory location)
	}
}
