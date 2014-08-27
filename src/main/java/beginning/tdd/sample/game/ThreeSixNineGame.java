package beginning.tdd.sample.game;


public class ThreeSixNineGame {
	private final String BING_GO = "짝";

	public String call(int number) {
		validNumber(number);

		int binggoCount = 0;

		char[] digits = String.valueOf(number).toCharArray();

		for (char each : digits) {
			if (each == '3' || each == '6' || each == '9') {
				binggoCount++;
			}
		}

		if (binggoCount < 1) {
			return String.valueOf(number);
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < binggoCount; i++) {
			result.append(BING_GO);
		}

		return result.toString();
	}

	private void validNumber(int number) {
		if (number > Integer.MAX_VALUE) {
			throw new RuntimeException(number + "is not permitted.");
		}

		if (number < 1) {
			throw new RuntimeException(number + "is not permitted.");
		}
	}
}
