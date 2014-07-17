package beginning.tdd.exercise.game;

public class ThreeSixNineGame {

	public static final String BING_GO = "짝";

	public static String call(int number) {

		if (number > Integer.MAX_VALUE) {
			throw new RuntimeException(number + " is not permitted.");
		}

		if (number < 1) {
			throw new RuntimeException(number + " is not permitted.");
		}

		int correctNumber = 0;
		char[] chars = String.valueOf(number).toCharArray();
		for (char c : chars) {
			if (c == '3' || c == '6' || c == '9') {
				correctNumber++;
			}
		}

		if (correctNumber < 1) {
			return String.valueOf(number);
		}

		StringBuffer correctBuffer = new StringBuffer();
		for (int i = 0; i < correctNumber; i++) {
			correctBuffer.append(BING_GO);
		}

		return correctBuffer.toString();
	}
}
