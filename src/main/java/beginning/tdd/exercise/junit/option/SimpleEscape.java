package beginning.tdd.exercise.junit.option;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

public class SimpleEscape {
	public static String escapeHtmlExceptBrTag(String source) {
		String escapedString = escapeHtml(source);
		escapedString = escapedString.replaceAll("&lt;[bB][rR]/?&gt;", "<br/>");
		escapedString = escapedString.replaceAll("<[bB][rR]/?>", "<br/>");

		return escapedString;
	}

	public static String escapeHtml(String source) {
		if (StringUtils.isEmpty(source)) {
			return "";
		}

		return StringEscapeUtils.escapeHtml(source);
	}

	public static String unescapeHtml(String source) {
		if (StringUtils.isEmpty(source)) {
			return "";
		}

		return StringEscapeUtils.unescapeHtml(source);
	}
}