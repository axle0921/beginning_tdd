package beginning.tdd.example.junit;

import static org.junit.Assume.*;

import org.junit.Test;

public class AssumeTest {
	@Test
	public void testIfVersioonGreaterThan4() {
		String versionNumber = "7"; // Get it from configuration on runtime
		assumeTrue(Integer.valueOf(versionNumber) == 7);

		System.out.println("Test executed");
	}
}