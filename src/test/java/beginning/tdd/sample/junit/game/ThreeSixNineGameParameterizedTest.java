package beginning.tdd.sample.junit.game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
		return Arrays.asList(new Object[][] { { 1, "1" }, { 3, "짝" }, { 369, "짝짝짝" }, { 36936943, "짝짝짝짝짝짝짝" }, { 1245721, "1245721" },
				{ 3999, "짝짝짝짝" } });
	}

	@Test
	public void testCall() {
		String actualResult = sut.call(number);

		assertThat(actualResult, is(expectedResult));
	}
}
