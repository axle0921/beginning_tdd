package beginning.tdd.example.testdouble;

import java.util.logging.Level;

public interface DLogTarget {
	void write(Level level, String message);
}