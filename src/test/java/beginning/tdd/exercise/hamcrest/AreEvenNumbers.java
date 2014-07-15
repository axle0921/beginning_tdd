package beginning.tdd.exercise.hamcrest;

import java.util.Collection;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class AreEvenNumbers extends TypeSafeMatcher<Collection<Integer>> {
	@Override
	public boolean matchesSafely(Collection<Integer> numbers) {
		for (Integer number : numbers) {
			if (number % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("even numbers");
	}

	@Factory
	public static <T> Matcher<Collection<Integer>> evenNumbers() {
		return new AreEvenNumbers();
	}
}
