package functionalInterface;

import java.util.function.BiPredicate; 

public class BiPredicateExample { 
	public static void main(String[] args) {
		
		BiPredicate<String, Integer> filter = (x, y) -> { 
			return x.length() == y; 
		};
		
		boolean result = filter.test("mkyong", 6); 
		System.out.println(result);
		
	}
}
