package beginning.tdd.exercise.game;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThreeSixNineGameHamcrestTest {
	private ThreeSixNineGame sut;

	@Before
	public void setUp() {
		sut = new ThreeSixNineGame();
	}

	@Test
	public void 숫자_1_입력() {
		// given
		int someNumber = 1;
		String expectedResult = "1";

		// when
		String actualResult = sut.call(someNumber);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_3_입력() {
		// given
		int someNumber = 3;
		String expectedResult = "짝";

		// when
		String actualResult = sut.call(someNumber);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_369_입력() {
		// given
		int someNumber = 369;
		String expectedResult = "짝짝짝";

		// when
		String actualResult = sut.call(someNumber);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_36936943_입력() {
		// given
		int someNumber = 36936943;
		String expectedResult = "짝짝짝짝짝짝짝";

		// when
		String actualResult = sut.call(someNumber);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_1245721_입력() {
		// given
		int someNumber = 1245721;
		String expectedResult = "1245721";

		// when
		String actualResult = sut.call(someNumber);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_3999_입력() {
		// given
		int someNumber = 3999;
		String expectedResult = "짝짝짝짝";
		String notExpectedResult = "3999";

		// when
		String actualResult = sut.call(someNumber);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(not(notExpectedResult)));
		assertThat(actualResult, is(expectedResult));
		assertNotSame(notExpectedResult, actualResult);
	}
}
