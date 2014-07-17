package beginning.tdd.exercise.junit.option;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecuteOrderTest {
	@Test
	public void a_test_1() {
		System.out.println("a_test_1 called..");
	}

	@Test
	public void d_test_2() {
		System.out.println("d_test_2 called..");
	}

	@Test
	public void c_test_3() {
		System.out.println("c_test_3 called..");
	}

	@Test
	public void b_test_4() {
		System.out.println("b_test_4 called..");
	}
}