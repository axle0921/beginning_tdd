package beginning.tdd.exercise.junit.option;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * 모든 메소드에 @Test(timeout = x) 규칙 적용.
 */
public class RuleOfTimeoutTest {
	@Rule
	public Timeout globalTimeout = new Timeout(2000);

	@Test
	public void infiniteLoop1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void infiniteLoop2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
