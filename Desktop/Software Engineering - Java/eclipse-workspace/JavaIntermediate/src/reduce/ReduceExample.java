package reduce;

import java.util.stream.IntStream;

public class ReduceExample {
	public static void main(String[] args) {
		
		int result = IntStream.range(1, 5)
				.reduce(23, (a,b) -> a + b);
		System.out.println(result);
		
		/* Worked example:
		 * 23 + 1 = 24
		 * 24 + 2 = 26
		 * 26 + 3 = 29
		 * 29 + 4 = 33
		 * Result = 33
		 * */
		
		int result1 = IntStream.range(1, 5)
				.parallel()
				.reduce(23, (a,b) -> a + b);
		System.out.println(result1);

		/* parallel() makes processing faster and 
		 * is useful for when you have a lot of data.
		 * */
		
		/* Worked example:
		 * 23 + 1 = 24
		 * 23 + 2 = 24
		 * 23 + 3 = 26
		 * 23 + 4 = 27
		 * Result - 24 + 25 + 26 + 27 = 102
		 * */
	}
}
