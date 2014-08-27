package beginning.tdd.sample.junit.warmup;

import java.util.Iterator;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;

public class RefactoredAlphabet {
	public String sortBy(String input) {
		toValidateArgument(input);

		return toSortByDeduplication(input);
	}

	String toSortByDeduplication(String input) {
		char[] letters = toCaseInsensitive(input);
		TreeSet<Character> sortedAlphabet = new TreeSet<Character>();

		for (char alphabet : letters) {
			sortedAlphabet.add(alphabet);
		}

		Iterator<Character> iterator = sortedAlphabet.iterator();
		StringBuilder result = new StringBuilder();

		while (iterator.hasNext()) {
			result.append(iterator.next());
		}

		return result.toString();
	}

	private char[] toCaseInsensitive(String input) {
		return input.toLowerCase().toCharArray();
	}

	void toValidateArgument(String input) {
		if (StringUtils.isBlank(input) || !StringUtils.isAlpha(input)) {
			throw new IllegalArgumentException("input is blank");
		}
	}

	/**
	 * 알파벳 아스키코드값. 대문자:65~90, 소문자:97~122
	 */
	public int calculateBy(String input) {
		toValidateArgument(input);
		String deduplicatedAlphabet = toSortByDeduplication(input);

		char[] letters = deduplicatedAlphabet.toCharArray();
		int score = 0;

		for (char ch : letters) {
			score += ch - 96;
		}

		return score;
	}
}
