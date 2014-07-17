package beginning.tdd.exercise.game;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ThreeSixNineGameParameterizedTest {

	private final int number;
	private final String expected;

	public ThreeSixNineGameParameterizedTest(int number, String expected) {
		this.number = number;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, "1" }, { 2, "2" },
				{ 3, "짝" }, { 9, "짝" }, { 333, "짝짝짝" }, { 369, "짝짝짝" },
				{ 300, "짝" }, { 990, "짝짝" } });
	}

	@Test
	public void test() {
		String actual = ThreeSixNineGame.call(number);
		System.out.println("number = " + number + ", result = " + expected
				+ ", actual = " + actual);
		assertEquals(expected, actual);
	}

}
