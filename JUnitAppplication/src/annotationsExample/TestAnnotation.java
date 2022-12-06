package annotationsExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotation {
	int english;
	int maths;
	int chemistry;
	
	@BeforeClass
	public static void methodBeforeClass() {
		System.out.println("@BeforeClass We are generating the report card.");
	}
	
	@Before
	public void methodBefore() {
		System.out.println("\nInitalize the marks");
		this.english = 99;
		this.maths = 86;
		this.chemistry = 65;
	}
	
	@After
	public void methodAfter() {
		this.english = 0;
		this.maths = 0;
		this.chemistry = 0;
		System.out.println("Result calculation completed.");
	}
	
	@AfterClass
	public static void methodAfterClass() {
		System.out.println("\n@AfterClass Report generated.");
	}
	
	@Ignore
	public void methodIgnore() {
		System.out.println("We will ignore other subjects.");
	}
	
	@Test 
	public void runFindBig() {
		assertEquals(true, Calculator.findAverageMarks(english, maths, chemistry));
	}

}

