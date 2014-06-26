package beginning.tdd.example.hamcrest;

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

	@Test
	public void hasItemExample() {
		assertTrue(sut.contains("x") || sut.contains("y") || sut.contains("z"));
		assertThat(sut, hasItem(anyOf(equalTo("x"), equalTo("y"), equalTo("z"))));
	}
}