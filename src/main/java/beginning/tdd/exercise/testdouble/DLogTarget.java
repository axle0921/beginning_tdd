package beginning.tdd.exercise.testdouble;

import java.util.logging.Level;

public interface DLogTarget {
	void write(Level level, String message);
}
