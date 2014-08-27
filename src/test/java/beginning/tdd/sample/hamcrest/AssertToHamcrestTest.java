package beginning.tdd.sample.hamcrest;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AssertToHamcrestTest {
	@Test
	public void testAssertEquals() {
		int expected = 51;
		int actual = 51;

		assertEquals(expected, actual);
		assertThat(actual, is(expected));
	}

	@Test
	public void testAssertArrayEquals() {
		String[] expected = { "one", "two", "three" };
		String[] actual = { "one", "two", "three" };

		assertArrayEquals(expected, actual);
		assertThat(actual, is(equalTo(expected)));
		assertThat(actual, is((expected)));
	}

	@Test
	public void testAssertNull() {
		assertNull(null);
		assertThat(null, is(nullValue()));
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
		assertThat(new Object(), is(notNullValue()));
	}

	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		Integer bNumber = aNumber;

		assertSame("should be same", bNumber, aNumber);
		assertThat("should be same", aNumber, is(sameInstance(bNumber)));
	}

	@Test
	public void testAssertGreaterThan() {
		assertTrue(getBalance() > 0);
		assertThat(getBalance(), is(greaterThan(0)));
	}

	private int getBalance() {
		return 10;
	}

	@Test
	public void testAssertStringContain() {
		String input = "Hamcrest comes with a library of useful matchers/";

		assertTrue(input.indexOf("Hamcrest") > -1);
		assertThat(input, is(containsString("Hamcrest")));
	}
}
