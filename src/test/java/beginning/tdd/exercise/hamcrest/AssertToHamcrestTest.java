package beginning.tdd.exercise.hamcrest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertToHamcrestTest {
	@Test
	public void testAssertEquals() {
		int expected = 51;
		int actual = 51;

		assertEquals(expected, actual);
	}

	@Test
	public void testAssertArrayEquals() {
		String[] expected = { "one", "two", "three" };
		String[] actual = { "one", "two", "three" };

		assertArrayEquals(expected, actual);
	}

	@Test
	public void testAssertNull() {
		assertNull(null);
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}

	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);

		assertSame("should be same", aNumber, aNumber);
	}

	@Test
	public void testAssertGreaterThan() {
		assertTrue(getBalance() > 0);
	}

	private int getBalance() {
		return 10;
	}

	@Test
	public void testAssertStringContain() {
		String input = "Hamcrest comes with a library of useful matchers/";

		assertTrue(input.indexOf("Hamcrest") > -1);
	}
}
