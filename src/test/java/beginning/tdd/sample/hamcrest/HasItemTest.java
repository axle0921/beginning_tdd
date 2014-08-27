package beginning.tdd.sample.hamcrest;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HasItemTest {
	private List<String> sut;

	@Before
	public void setUp() {
		sut = new ArrayList<String>();
		sut.add("x");
		sut.add("y");
		sut.add("z");
	}

	/**
	 * assertTrue Vs. assertThat : 가독성, 디버깅
	 */
	@Test
	public void hasItemExample() {
		String expectedOne = "x";
		String expectedTwo = "y";
		String expectedThree = "x";

		assertTrue(sut.contains(expectedOne) || sut.contains(expectedTwo) || sut.contains(expectedThree));
		assertThat(sut, hasItem(anyOf(equalTo(expectedOne), equalTo(expectedTwo), equalTo(expectedThree))));
	}
}
