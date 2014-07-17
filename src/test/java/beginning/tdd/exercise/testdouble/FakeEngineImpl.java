package beginning.tdd.exercise.testdouble;

import beginning.tdd.exercise.testdouble.Engine;

/**
 * Fake Object - 시나리오별 Test Stub을 구성해야 할 경우 시나리오별 Fake Object를 통한 테스트 구성.
 */
public class FakeEngineImpl implements Engine {
	private boolean isRunning;

	/**
	 * Test Stub
	 */
	@Override
	public void start() {
		isRunning = true;
	}

	/**
	 * Test Stub
	 */
	@Override
	public void stop() {
		isRunning = false;
	}

	/**
	 * Test Spy
	 */
	public boolean isRunning() {
		return isRunning;
	}
}
