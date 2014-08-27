package beginning.tdd.sample.junit.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class AlphabetJunit {
	public String sortBy(String input) {
		toValidateArgument(input);
		String lowerAlphabet = toLowerCase(input);
		String deduplicatedAlphabet = toRemoveDuplication(lowerAlphabet);

		return toSort(deduplicatedAlphabet);
	}

	public String toLowerCase(String input) {
		return StringUtils.lowerCase(input);
	}

	String toSort(String input) {
		char[] letters = input.toCharArray();
		Arrays.sort(letters);

		StringBuilder result = new StringBuilder();

		for (char alphabet : letters) {
			result.append(alphabet);
		}

		return result.toString();
	}

	String toRemoveDuplication(String input) {
		char[] letters = input.toCharArray();
		List<Character> deduplicatedLetters = new ArrayList<Character>();

		for (int i = 0; i < letters.length; i++) {
			if (!deduplicatedLetters.contains(letters[i])) {
				deduplicatedLetters.add(letters[i]);
			}
		}

		Iterator<Character> it = deduplicatedLetters.iterator();
		StringBuilder result = new StringBuilder();

		while (it.hasNext()) {
			result.append(it.next());
		}

		return result.toString();
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
		String lowerAlphabet = toLowerCase(input);
		String deduplicatedAlphabet = toRemoveDuplication(lowerAlphabet);

		char[] letters = deduplicatedAlphabet.toCharArray();
		int score = 0;

		for (char ch : letters) {
			score += ch - 96;
		}

		return score;
	}
}
