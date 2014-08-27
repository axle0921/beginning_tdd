package beginning.tdd.sample.legacy;

public class WrongRefactor {
	private int alpha = 0;

	private int getValue() {
		return alpha++;
	}

	public int doSomething() {
		int value = getValue();
		int total = 0;

		for (int n = 0; n < 10; n++) {
			total += value;
		}

		return total;
	}

	public int modifyDoSomething() {
		int total = 0;

		for (int n = 0; n < 10; n++) {
			total += getValue(); // inline
		}

		return total;
	}
}
