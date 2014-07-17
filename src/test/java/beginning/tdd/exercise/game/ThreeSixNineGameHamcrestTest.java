package beginning.tdd.exercise.game;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSixNineGameHamcrestTest {

	@Test
	public void 숫자_1_입력() {
		// given
		int number = 1;
		String expectedResult = "1";

		// when
		String actualResult = ThreeSixNineGame.call(number);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_3_입력() {
		// given
		int number = 3;
		String expectedResult = "짝";

		// when
		String actualResult = ThreeSixNineGame.call(number);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 숫자_369_입력() {
		// given
		int number = 369;
		String expectedResult = "짝짝짝";

		// when
		String actualResult = ThreeSixNineGame.call(number);

		// then
		assertEquals(expectedResult, actualResult);
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 입력값이_minus1인_경우_RuntimeException_처리한다() {
		try {
			int number = -1;
			ThreeSixNineGame.call(number);
			fail();
		} catch (RuntimeException e) {
		}
	}
}
