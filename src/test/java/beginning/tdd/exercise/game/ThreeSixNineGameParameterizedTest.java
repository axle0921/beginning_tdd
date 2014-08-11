package beginning.tdd.exercise.game;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ThreeSixNineGameParameterizedTest {
	private ThreeSixNineGame sut;

	private int number;
	private String expectedResult;

	public ThreeSixNineGameParameterizedTest(int number, String expectedResult) {
		this.number = number;
		this.expectedResult = expectedResult;
	}

	@Before
	public void setUp() {
		sut = new ThreeSixNineGame();
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, "1" }, { 3, "짝" } });
	}

	@Test
	public void testCall() {
		String actualResult = sut.call(number);

		assertThat(actualResult, is(expectedResult));
	}
}
