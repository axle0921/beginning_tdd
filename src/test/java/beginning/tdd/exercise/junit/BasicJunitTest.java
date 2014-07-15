package beginning.tdd.exercise.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import beginning.tdd.exercise.junit.Alphabet;

/**
 * RunWith annotation - https://github.com/junit-team/junit/wiki/Test-runners
 */
@RunWith(JUnit4.class)
public class BasicJunitTest {
	private Alphabet sut;

	@Before
	public void setUp() {
		sut = new Alphabet();
	}

	/**
	 * Declaring test methods
	 */
	@Test
	public void testCalculateScore() {
		String someInput = "abc";
		int expectedResult = 6;
		Alphabet alphabet = new Alphabet();

		int actualResult = alphabet.calculateScore(someInput);

		assertEquals("알파벳 점수 계산하기", expectedResult, actualResult);
	}

	/**
	 * Test setup
	 */
	@Test
	public void testSortDeduplication() {
		String someInput = "abfedxcpzsjlkrmmmmmmm";
		String expectedResult = "abcdefjklmprsxz";

		String actualResult = sut.sortDeduplication(someInput);

		assertEquals("알파벳 오름차순 정렬하기", expectedResult, actualResult);
	}

	/**
	 * Test setup
	 */
	@Test
	public void 알파벳만_입력하면_true_이다() {
		String someInput = "abfe";
		boolean expectedResult = true;

		boolean actualResult = sut.isAlphabet(someInput);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void 알파벳만_입력하지_않으면_false_이다() {
		String someInput = "1ab2fe3";
		boolean expectedResult = false;

		boolean actualResult = sut.isAlphabet(someInput);

		assertEquals(expectedResult, actualResult);
	}

	/**
	 * Expected exceptions
	 */
	@Test
	public void testSortDeduplicationException() {
		try {
			String someInput = null;

			sut.sortDeduplication(someInput);

			fail("null 객체가 넘어가면 IllegalArgumentException이 발생한다.");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Expected exceptions
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCalculateScoreException() {
		String someInput = null;

		sut.calculateScore(someInput);
	}

	/**
	 * Setting a timeout
	 */
	@Test(timeout = 2000)
	public void testTimeout() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Ignore("Not Ready to Run")
	@Test
	public void testIgnore() {
		System.out.println("Method is not ready yet");
	}
}