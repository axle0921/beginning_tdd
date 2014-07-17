package beginning.tdd.exercise.junit.basic;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import beginning.tdd.exercise.junit.basic.Calculation;

@RunWith(JUnit4.class)
public class CalculationTest {
	@Test
	public void testPlusBy() {
		int someA = 1;
		int someB = 2;
		int expectedResult = 3;
		Calculation calculation = new Calculation();

		int actualResult = calculation.plusBy(someA, someB);

		assertEquals("1+2=3", expectedResult, actualResult);
	}

	@Test
	public void testMinusBy() {
		int someA = 10;
		int someB = 5;
		int expectedResult = 5;
		Calculation calculation = new Calculation();

		int actualResult = calculation.minusBy(someA, someB);

		assertEquals("10-5=5", expectedResult, actualResult);
	}

	@Test
	public void testMultiplyBy() {
		int someA = 10;
		int someB = 5;
		int expectedResult = 50;
		Calculation calculation = new Calculation();

		int actualResult = calculation.multiplyBy(someA, someB);

		assertEquals("10*5=50", expectedResult, actualResult);
	}

	/**
	 * Setting a timeout
	 */
	@Test(timeout = 2000)
	public void testTimeout() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Ignore("Not Ready to Run")
	@Test
	public void testIgnore() {
		System.out.println("Method is not ready yet");
	}
}