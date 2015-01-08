package beginning.tdd.sample.legacy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class OriginalDuckTest {
	private OriginalDuck sut;

	@Before
	public void setUp() {
		// sut = new Duck();
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
		String expectedResult = "duck";

		String actualResult = sut.display();

		assertThat(actualResult, is(expectedResult));
	}
}
