package beginning.tdd.sample.hamcrest.custom;

import static beginning.tdd.sample.hamcrest.custom.AreEvenNumbers.evenNumbers;
import static beginning.tdd.sample.hamcrest.custom.IsNotANumber.notANumber;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CustomMatcherTest {
	@Test
	public void testSquareRootOfMinusOneIsNotANumber() {
		assertThat(Math.sqrt(-1), is(notANumber()));
	}

	@Test
	public void testDecimalIsNotANumber() {
		assertThat(1.0, is(notANumber()));
	}

	@Test
	public void shouldHaveOnlyEvenNumbers() {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

		assertThat(numbers, is(evenNumbers()));
	}

	@Test
	public void shouldNotHaveOddNumbers() {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 8, 10);

		assertThat(numbers, not(evenNumbers()));
	}
}
