package beginning.tdd.exercise.legacy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExtendedRedheadDuckTest {
	private ExtendedRedheadDuck sut;

	@Before
	public void setUp() {
		sut = new ExtendedRedheadDuck();
	}

	@Test
	public void testQuack() {
		String expectedResult = "quack";

		String actualResult = sut.quack();

		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void testSwim() {
		String expectedResult = "swim";

		String actualResult = sut.swim();

		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void testDisplay() {
		String expectedResult = "RedheadDuck";

		String actualResult = sut.display();

		assertThat(actualResult, is(expectedResult));
	}
}
