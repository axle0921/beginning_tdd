package beginning.tdd.exercise.junit;

import static org.junit.Assume.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @Before 혹은 @Test 등에서 Assume을 호출하여 테스트를 계속 실행할지 아니면 중단할지를 결정할 수 있다.
 *
 */
public class AssumeTest {
	@Before
	public void beforeMethod() {
		assumeTrue(someCondition());
	}

	private boolean someCondition() {
		// return false;
		return true;
	}

	/**
	 * Get it from configuration on runtime
	 */
	@Test
	public void testIfVersioonGreaterThan4() {
		String versionNumber = "7";
		assumeTrue(Integer.valueOf(versionNumber) == 7);

		System.out.println("Test executed");
	}
}
