package beginning.tdd.exercise.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlphabetTest {
	private Alphabet sut;

	@Test
	public void 대소문자_구분없이_알파벳_졍렬하기() {
		String someAlphabet = "ADCcbehIFg";
		String expectedResult = "abcdefghi";
		sut = new Alphabet();

		String actualResult = sut.sortBy(someAlphabet);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 알파벳을_모두_소문자_처리한다() {
		String someAlphabet = "aBcDeFg";
		String expectedResult = "abcdefg";
		sut = new Alphabet();

		String actualResult = sut.toLowerCase(someAlphabet);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 알베벳을_A_Z_순으로_정렬한다() {
		String someAlphabet = "ecdaab";
		String expectedResult = "aabcde";
		sut = new Alphabet();

		String actualResult = sut.toSort(someAlphabet);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 알파벳_중복을_제거한다() {
		String someAlphabet = "ecdaab";
		String expectedResult = "ecdab";
		sut = new Alphabet();

		String actualResult = sut.toRemoveDuplication(someAlphabet);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 입력값이_null인_경우_IllegalArgumentException_처리한다() {
		try {
			String someInput = null;
			sut = new Alphabet();

			sut.toValidateArgument(someInput);

			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void 입력값이_empty인_경우_IllegalArgumentException_처리한다() {
		try {
			String someInput = "";
			sut = new Alphabet();

			sut.toValidateArgument(someInput);

			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void 입력값이_blank인_경우_IllegalArgumentException_처리한다() {
		try {
			String someInput = " ";
			sut = new Alphabet();

			sut.toValidateArgument(someInput);

			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void 입력값이_알파벳외의_문자가_있는경우_IllegalArgumentException_처리한다() {
		try {
			String someInput = "한.abc!";
			sut = new Alphabet();

			sut.toValidateArgument(someInput);

			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	@Test
	public void 알파벳_계산하기() {
		String someInput = "aAbc";
		int expectedResult = 6;
		Alphabet alphabet = new Alphabet();

		int actualResult = alphabet.calculateBy(someInput);

		assertEquals(expectedResult, actualResult);
	}
}