package functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> (a * b);
		System.out.println(biFunction.apply(5, 50));
		
		BiFunction<String, String, String> biFunction1 = (a,b) -> ("Hello " + a + " and " + b);
		System.out.println(biFunction1.apply("Zack", "Cody"));
		
		/* Takes two arguments and returns 1 argument
		 * <Integer, Integer, Integer> - First two are inputs and the last one is output
		 * */
	}
}
