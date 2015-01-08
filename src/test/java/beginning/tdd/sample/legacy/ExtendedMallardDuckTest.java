package beginning.tdd.sample.legacy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ExtendedMallardDuckTest {
	private ExtendedMallardDuck sut;

	@Before
	public void setUp() {
		sut = new ExtendedMallardDuck();
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
		String expectedResult = "MallardDuck";

		String actualResult = sut.display();

		assertThat(actualResult, is(expectedResult));
	}
}
