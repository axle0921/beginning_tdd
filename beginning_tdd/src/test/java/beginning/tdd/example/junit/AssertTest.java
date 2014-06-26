package beginning.tdd.example.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {
	@Test
	public void testAssertTrue() {
		assertTrue("failure - should be true", true);
	}

	@Test
	public void testAssertFalse() {
		assertFalse("failure - should be false", false);
	}

	@Test
	public void testAssertEquals() {
		assertEquals("failure - strings not same", 5l, 5l);
	}

	@Test
	public void testAssertArrayEquals() {
		String[] expected = { "one", "two", "three" };
		String[] actual = { "one", "two", "three" };

		assertArrayEquals("failure - arrays not same", expected, actual);
	}

	@Test
	public void testAssertNull() {
		assertNull("should be null", null);
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull("should not be null", new Object());
	}

	/**
	 * assertSame 메소드의 목적은 actual과 expected가 동일한 객체를 참조하는지를 확인
	 */
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		assertSame("should be same", aNumber, aNumber);
	}

	@Test
	public void testAssertNotSame() {
		assertNotSame("should not be same Object", new Object(), new Object());
	}
}