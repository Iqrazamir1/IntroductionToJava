package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import unit.Calculator;

public class TestProduct {
	@Test 
	public void runFindMax() {
		int[] myArray = {100, 20, 30, 1500, 400};
		assertEquals(340, Calculator.findMax(myArray));
	}
	
}
