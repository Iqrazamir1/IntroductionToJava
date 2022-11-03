package conditions;

public class OperationExample {
	
	public static void main(String[] args) {
		
		/* Operators:
		 * 
		 * 1. AssignValue =
		 * 2. Plus +
		 * 3. Minus -
		 * 4. Divide /
		 * 5. Multiply *
		 * 6. Modulus %
		 * 7. IndicatesPositiveValue +
		 * 8. IndicatesNegativeValue -
		 * 9. IncrementsBy1 ++
		 * 10. DecrementsBy1 --
		 * 11. NotOperators ! 
		 * */

		int x = 10; // Adds one after 
		int y = x++;
		System.out.println(y);
		
		int m = 20; // Adds one before 
		int z = ++m;
		System.out.println(z);
		
		/* Operators:
		 * 
		 * 1. IsEqualTo ==
		 * 2. IsNotEqualTo !=
		 * 3. LessThan <
		 * 4. GreaterThan >
		 * 5. LessThanOrEqualTo <=
		 * 6. GreaterThanOrEqualTo >=
		 * 7. AND &&
		 * 8. OR ||
		 * 9. BitwiseAND &
		 * 10. BitwiseOR |
		 * */
		
		String city = "NewYork"; // OR (||) Example
		
		if (city == "NewYork" || city == "France") {
			System.out.println("You are in Europe!");
		} else {
			System.out.println("You are not in Europe!");
		}

	}

}
