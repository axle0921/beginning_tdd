package beginning.tdd.sample.legacy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MallardDuckTest {
	private MallardDuck sut;

	@Before
	public void setUp() {
		sut = new MallardDuck();
	}

	@Test
	public void testDisplay() {
		String expectedResult = "MallardDuck";

		String actualResult = sut.display();

		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void testPerformFly() {
		String expectedResult = "FlyWithWings";

		String actualResult = sut.performFly();

		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void testPerformQuack() {
		String expectedResult = "Quack";

		String actualResult = sut.performQuack();

		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void testSwim() {
		String expectedResult = "swim";

		String actualResult = sut.swim();

		assertThat(actualResult, is(expectedResult));
	}
}
