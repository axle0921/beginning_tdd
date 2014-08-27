package beginning.tdd.sample.legacy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RefactoringToolQuirksTest {
	private RefactoringToolQuirks sut;

	@Before
	public void setUp() {
		sut = new RefactoringToolQuirks();
	}

	@Test
	public void testCalculate() {
		int someValue = 3;
		int expectedResult = 4;

		int actualResult = sut.calculate(someValue);

		assertThat(actualResult, is(expectedResult));
	}
}
