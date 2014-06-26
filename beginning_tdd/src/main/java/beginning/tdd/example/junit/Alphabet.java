package beginning.tdd.example.junit;

import java.util.Iterator;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;

public class Alphabet {
	public int calculateScore(String input) {
		if (StringUtils.isBlank(input)) {
			throw new IllegalArgumentException("input is blank");
		}

		char[] word = input.toLowerCase().toCharArray();
		int score = 0;

		for (char ch : word) {
			score += ch - 96;
		}

		return score;
	}

	public String sortDeduplication(String input) {
		if (StringUtils.isBlank(input)) {
			throw new IllegalArgumentException("input is blank");
		}

		char[] word = input.toLowerCase().toCharArray();
		TreeSet<Character> ts = new TreeSet<Character>();

		for (char ch : word) {
			ts.add(ch);
		}

		Iterator<Character> it = ts.iterator();
		StringBuilder sortedWord = new StringBuilder();

		while (it.hasNext()) {
			sortedWord.append(it.next());
		}

		return sortedWord.toString();
	}

	public boolean isAlphabet(String input) {
		if (StringUtils.isBlank(input)) {
			throw new IllegalArgumentException("input is blank");
		}

		return StringUtils.isAlpha(input) ? true : false;
	}
}