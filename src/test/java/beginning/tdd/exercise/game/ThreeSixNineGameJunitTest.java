package beginning.tdd.exercise.game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThreeSixNineGameJunitTest {
	private ThreeSixNineGame sut;

	@Before
	public void setUp() {
		sut = new ThreeSixNineGame();
	}

	@Test
	public void 숫자_1_입력() {
		int someNumber = 1;
		String expectedResult = "1";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 숫자_3_입력() {
		int someNumber = 3;
		String expectedResult = "짝";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 숫자_13_입력() {
		int someNumber = 13;
		String expectedResult = "짝";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 숫자_36_입력() {
		int someNumber = 36;
		String expectedResult = "짝짝";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 숫자_336_입력() {
		int someNumber = 336;
		String expectedResult = "짝짝짝";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 숫자_33330_입력() {
		int someNumber = 33330;
		String expectedResult = "짝짝짝짝";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 숫자_36936943_입력() {
		int someNumber = 36936943;
		String expectedResult = "짝짝짝짝짝짝짝";

		String actualResult = sut.call(someNumber);

		assertEquals(expectedResult, actualResult);
	}

	@Test(expected = RuntimeException.class)
	public void 숫자_음수1_입력() {
		int someNumber = -1;

		sut.call(someNumber);
	}

	@Test(expected = RuntimeException.class)
	public void 숫자_최고수보다_하나더큰수_2147483648_입력() {
		int someNumber = 2147483647;

		sut.call(someNumber + 1);
	}

	@Test
	public void 입력값이_minus1인_경우_RuntimeException_처리한다() {
		try {
			int someNumber = -1;

			sut.call(someNumber);

			fail();
		} catch (RuntimeException e) {
		}
	}

	@Test
	public void 입력값이_Integer최대값보다_하나더큰경우_RuntimeException_처리한다() {
		try {
			int someNumber = 2147483647;

			sut.call(someNumber + 1);

			fail();
		} catch (RuntimeException e) {
		}
	}
}
