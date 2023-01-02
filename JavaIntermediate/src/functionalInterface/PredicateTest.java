package functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = a -> (a > 10);
		System.out.println(predicate.test(5));
		
		/* Takes something and checks the condition and then returns boolean 
		 * */
	}
}
