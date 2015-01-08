package beginning.tdd.sample.testdouble;

import static org.junit.Assert.assertTrue;

import java.util.logging.Level;

import org.junit.Test;

public class DLogTest {
	@Test
	public void writesEachMessageToAllTargets() throws Exception {
		DLogTarget spy1 = new SpyDLogTargetImpl();
		DLogTarget spy2 = new SpyDLogTargetImpl();

		// 스파이 잠입.
		DLog log = new DLog(spy1, spy2);
		log.write(Level.INFO, "message");

		// 스파이 결과 보고.
		assertTrue(((SpyDLogTargetImpl) spy1).received(Level.INFO, "message"));
		assertTrue(((SpyDLogTargetImpl) spy2).received(Level.INFO, "message"));
	}
}
