package beginning.tdd.exercise.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <pre>
 * 1.대소문자 구분없이 A~Z 순으로 정렬한다. 
 * - 알파벳을 모두 소문자 처리한다. 
 * - A~Z 순으로 정렬한다. 
 * 2.알파벳 중복을 제거한다.
 * 3.입력 값이 없거나 알파이 아닌 경우 IllegalArgumentException 처리한다.
 * - null 인경우
 * - empty
 * - blank
 * - alphabet외의 문자가 있는 경우
 * </pre>
 */
public class RefactoredAlphabetTest {
	private RefactoredAlphabet sut;

	@Before
	public void setUp() {
		sut = new RefactoredAlphabet();
	}

	@Test
	public void 대소문자_구분없이_알파벳_졍렬하기() {
		String someAlphabet = "ADCcbehIFg";
		String expectedResult = "abcdefghi";

		String actualResult = sut.sortBy(someAlphabet);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 입력값이_null인_경우_IllegalArgumentException_처리한다() {
		try {
			String someInput = null;

			sut.toValidateArgument(someInput);

			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void 입력값이_empty인_경우_IllegalArgumentException_처리한다() {
		try {
			String someInput = "";

			sut.sortBy(someInput);

			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void 입력값이_blank인_경우_IllegalArgumentException_처리한다() {
		String someInput = " ";

		sut.toValidateArgument(someInput);
	}

	@Test(expected = IllegalArgumentException.class)
	public void 입력값이_알파벳외의_문자가_있는경우_IllegalArgumentException_처리한다() {
		String someInput = "한.abc!";

		sut.sortBy(someInput);
	}

	@Test
	public void 알파벳_계산하기() {
		String someInput = "aAbc";
		int expectedResult = 6;

		int actualResult = sut.calculateBy(someInput);

		assertEquals(expectedResult, actualResult);
	}
}
