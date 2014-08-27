package beginning.tdd.sample.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class Alphabet {
	public static void main(String args[]) {
		String input = "AxfDb";

		Alphabet sortedAlphabet = new Alphabet();

		String sortedAlphabetResult = sortedAlphabet.sortBy(input);
		System.out.println("sortedAlphabetResult >>> " + sortedAlphabetResult);

		int alpabetScore = sortedAlphabet.calculateBy(input);
		System.out.println("alpabetScore >>> " + alpabetScore);

	}

	public String sortBy(String input) {
		if (StringUtils.isBlank(input) || !StringUtils.isAlpha(input)) {
			throw new IllegalArgumentException("input is blank");
		}

		String lowerAlphabet = StringUtils.lowerCase(input);

		System.out.println("lowerAlphabet > " + lowerAlphabet);

		char[] letters = lowerAlphabet.toCharArray();
		List<Character> deduplicatedLetters = new ArrayList<Character>();

		for (int i = 0; i < letters.length; i++) {
			if (!deduplicatedLetters.contains(letters[i])) {
				deduplicatedLetters.add(letters[i]);
			}
		}

		Iterator<Character> it = deduplicatedLetters.iterator();
		StringBuilder sb = new StringBuilder();

		while (it.hasNext()) {
			sb.append(it.next());
		}

		String deduplicatedAlphabet = sb.toString();

		System.out.println("deduplicatedAlphabet > " + deduplicatedAlphabet);

		char[] ch = deduplicatedAlphabet.toCharArray();
		Arrays.sort(ch);

		StringBuilder result = new StringBuilder();

		for (char alphabet : ch) {
			result.append(alphabet);
		}

		return result.toString();
	}

	/**
	 * 알파벳 아스키코드값. 대문자:65~90, 소문자:97~122
	 */
	public int calculateBy(String input) {
		if (StringUtils.isBlank(input) || !StringUtils.isAlpha(input)) {
			throw new IllegalArgumentException("input is blank");
		}

		String lowerAlphabet = StringUtils.lowerCase(input);

		char[] letters = lowerAlphabet.toCharArray();
		List<Character> deduplicatedLetters = new ArrayList<Character>();

		for (int i = 0; i < letters.length; i++) {
			if (!deduplicatedLetters.contains(letters[i])) {
				deduplicatedLetters.add(letters[i]);
			}
		}

		Iterator<Character> it = deduplicatedLetters.iterator();
		StringBuilder sb = new StringBuilder();

		while (it.hasNext()) {
			sb.append(it.next());
		}

		String deduplicatedAlphabet = sb.toString();

		char[] ch = deduplicatedAlphabet.toCharArray();
		int score = 0;

		for (char each : ch) {
			score += each - 96;
		}

		return score;
	}
}
