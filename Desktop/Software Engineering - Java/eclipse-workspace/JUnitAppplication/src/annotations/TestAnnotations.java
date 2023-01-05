package annotations;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import unit.Calculator;

public class TestAnnotations {
	
	@BeforeClass
	public static void methodBeforeClass() {
		System.out.println("@BeforeClass Executes before all of the classes");
	}
	
	@Before
	public void methodBefore() {
		System.out.println("\n@Before Executes before each class");
	}
	
	@After
	public void methodAfter() {
		System.out.println("@After Executes after each class");
	}
	
	@AfterClass
	public static void methodAfterClass() {
		System.out.println("\n@AfterClass Executes after all of the classes");
	}
	
	@Ignore
	public void methodIgnore() {
		System.out.println("I am ignored in this app");
	}
	
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
		assertEquals(1000, Calculator.findBiggest(20, 1000, 15));
	}
	@Test 
	public void runFindMax() {
		int[] myArray = {10, 15, 1500, 100};
		assertEquals(1500, Calculator.findMax(myArray));
	}
	
}
