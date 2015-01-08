package beginning.tdd.sample.junit.option;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedSimpleEscapeTest {
	private String params;
	private String expected;

	@Test
	public void testEscapeHtmlExceptBrTag() {
		assertEquals("<br/>", SimpleEscape.escapeHtmlExceptBrTag("<br>"));
		assertEquals("<br/>", SimpleEscape.escapeHtmlExceptBrTag("<Br>"));
		assertEquals("<br/>", SimpleEscape.escapeHtmlExceptBrTag("<BR>"));
		assertEquals("<br/>", SimpleEscape.escapeHtmlExceptBrTag("<bR>"));

	}

	public ParameterizedSimpleEscapeTest(String params, String expected) {
		this.params = params;
		this.expected = expected;
	}

	@Test
	public void testEscape() throws Exception {

		String actual = SimpleEscape.escapeHtml(expected);

		assertEquals(params, actual);
	}

	@Test
	public void testUnescapeHtml() throws Exception {

		String actual = SimpleEscape.unescapeHtml(params);

		assertEquals(expected, actual);
	}

	@Parameters
	public static Collection<String[]> getTestData() {
		return Arrays.asList(new String[][] { { "&quot;", "\"" }, { "&lt;", "<" }, { "&gt;", ">" }, { "&amp;", "&" },
				{ "&quot;&lt;&gt;&amp;", "\"<>&" }, { "&quot;String&lt;String&gt;String&amp;String", "\"String<String>String&String" }, { "", "" } });
	}
}
