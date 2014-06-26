package beginning.tdd.example.hamcrest;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HamcrestExampleTest {
	private HelloWorld sut;

	@Before
	public void setUp() {
		sut = new HelloWorld();
	}

	@Test
	public void equalsToExample() {
		// given
		String someMessage = "World";
		String expectedResult = "Hello World!";

		// when
		String actualResult = sut.getMessage(someMessage);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void notNullExample() {
		// given
		String someMessage = "World";

		// when
		String actualResult = sut.getMessage(someMessage);

		// then
		assertNotNull(actualResult);
		assertThat(actualResult, is(notNullValue()));
	}

	@Test
	public void trueExample() {
		// given
		String someMessage = "World";

		// when
		String actualResult = sut.getMessage(someMessage);

		// then
		assertTrue(actualResult.indexOf("Hello1") > -1); // Failure Trace 비교
		assertThat(actualResult, containsString("Hello1")); // Failure Trace 비교
	}
}
