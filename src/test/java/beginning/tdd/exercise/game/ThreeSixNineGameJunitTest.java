package beginning.tdd.exercise.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSixNineGameJunitTest {

	@Test
	public void 숫자_1_입력() {
		String result = ThreeSixNineGame.call(1);
		assertEquals("1", "1", result);
	}

	@Test
	public void 숫자_3_입력() {
		String result = ThreeSixNineGame.call(3);
		assertEquals("3", "짝", result);
	}

	@Test
	public void 숫자_13_입력() {
		String result = ThreeSixNineGame.call(13);
		assertEquals("13", "짝", result);
	}

	@Test
	public void 숫자_36_입력() {
		String result = ThreeSixNineGame.call(36);
		assertEquals("36", "짝짝", result);
	}

	@Test
	public void 숫자_336_입력() {
		String result = ThreeSixNineGame.call(336);
		assertEquals("336", "짝짝짝", result);
	}

	@Test
	public void 숫자_33330_입력() {
		String result = ThreeSixNineGame.call(33330);
		assertEquals("33330", "짝짝짝짝", result);
	}

	@Test
	public void 숫자_36936943_입력() {
		String result = ThreeSixNineGame.call(36936943);
		assertEquals("36936943", "짝짝짝짝짝짝짝", result);
	}

	@Test(expected = RuntimeException.class)
	public void 숫자_음수1_입력() {
		ThreeSixNineGame.call(-1);
	}

	@Test(expected = RuntimeException.class)
	public void 숫자_최고수보다_하나더큰수_2147483648_입력() {
		ThreeSixNineGame.call(2147483647 + 1);
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

	@Test
	public void 입력값이_Integer최대값보다_하나더큰경우_RuntimeException_처리한다() {
		try {
			int number = 2147483647 + 1;
			ThreeSixNineGame.call(number);
			fail();
		} catch (RuntimeException e) {
		}
	}
}
