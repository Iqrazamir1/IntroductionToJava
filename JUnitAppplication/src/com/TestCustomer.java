package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import unit.Calculator;

public class TestCustomer {
	@Test 
	public void runFindBiggest() {
		assertEquals(26, Calculator.findBiggest(10, 20, 15));
	}
	
}
