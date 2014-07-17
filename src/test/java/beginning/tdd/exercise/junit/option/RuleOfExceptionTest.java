package beginning.tdd.exercise.junit.option;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleOfExceptionTest {
	// ExpectedException 규칙을 "none"으로 초기화 한다.
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void thisTestPasses() {
	}

	@Test
	public void throwsExceptionAsExpected() {
		// NullPointerException 명시.
		exception.expect(NullPointerException.class);
		throw new NullPointerException();
	}

	@Test
	public void throwsExceptionWithCorrectMessage() {
		exception.expect(RuntimeException.class);
		exception.expectMessage("boom"); // "boom"을 포함해야 한다고 명시.
		throw new RuntimeException("Ka-boom!");
	}
}
