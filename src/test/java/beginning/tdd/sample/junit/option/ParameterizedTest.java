package beginning.tdd.sample.junit.option;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private final int x;
	private final int y;

	public ParameterizedTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
	}

	@Test
	public void test() {
		System.out.println("x = " + y + ", y = " + x);
	}
}
