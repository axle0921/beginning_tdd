package beginning.tdd.sample.tfd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TemplateTest {
	private Template sut;

	@Test
	public void oneVariable() {
		// given
		sut = new Template("Hello", "Reader");

		// when
		String actualResult = sut.evaluate();

		// then
		assertThat(actualResult, is("Hello, Reader"));
	}

	@Test
	public void differentValue() {
		// given
		sut = new Template("Hello", "someone else");

		// when
		String actualResult = sut.evaluate();

		// then
		assertThat(actualResult, is("Hello, someone else"));
	}

	@Test
	public void differentTemplate() {
		// given
		sut = new Template("Hi", "someone else");

		// when
		String actualResult = sut.evaluate();

		// then
		assertThat(actualResult, is("Hi, someone else"));
	}
}
