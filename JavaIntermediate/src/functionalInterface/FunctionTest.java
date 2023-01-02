package functionalInterface;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		Function<Integer, Integer> function = (x) -> (x + 100);
		System.out.println(function.apply(200));
		
		/* Takes one arguments and returns 1 argument
		 * <Integer, Integer> - The first one is inputs and the last one is output
		 * */
	}
}
