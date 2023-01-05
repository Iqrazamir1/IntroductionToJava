package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test 
	public void runFindBig() {
		assertEquals(200, Calculator.findBig(100, 200));
	}
	
	@Test 
	public void runFindSmall() {
		assertEquals(200, Calculator.findSmall(100, 200));
	}
	
	@Test 
	public void runFindBiggest() {
		assertEquals(20, Calculator.findBiggest(10, 20, 15));
	}
	
	@Test 
	public void runFindMax() {
		int[] myArray = {10, 15, 1500, 100};
		assertEquals(1500, Calculator.findMax(myArray));
	}

	/* assertEquals - checks if first argument is equal 
	 * 					to the second argument.
	 * */
	
}
