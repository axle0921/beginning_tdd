package beginning.tdd.sample.testdouble;

import java.util.logging.Level;

public class DLog {
	private final DLogTarget[] targets;

	public DLog(DLogTarget... targets) {
		this.targets = targets;
	}

	/**
	 * 반환값이 없어 단언을 통해 검증할 수 없다.
	 */
	public void write(Level level, String message) {
		for (DLogTarget each : targets) {
			each.write(level, message);
		}
	}
}
