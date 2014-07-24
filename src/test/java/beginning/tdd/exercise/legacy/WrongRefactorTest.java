package beginning.tdd.exercise.legacy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WrongRefactorTest {
	private WrongRefactor sut;

	@Before
	public void setUp() {
		sut = new WrongRefactor();
	}

	@Test
	public void testDoSomething() {
		int expectedResult = 0;

		int actualResult = sut.doSomething();

		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void modifyDoSomething() {
		int expectedResult = 45;

		int actualResult = sut.modifyDoSomething();

		assertThat(actualResult, is(expectedResult));
	}
}
