package beginning.tdd.exercise.testdouble;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import beginning.tdd.exercise.testdouble.DLogTarget;

public class SpyDLogTargetImpl implements DLogTarget {
	private List<String> log = new ArrayList<String>();

	@Override
	public void write(Level level, String message) {
		log.add(concatenated(level, message));
	}

	boolean received(Level level, String message) {
		return log.contains(concatenated(level, message));
	}

	private String concatenated(Level level, String message) {
		return level.getName() + ": " + message;
	}
}
