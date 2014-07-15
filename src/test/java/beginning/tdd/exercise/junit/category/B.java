package beginning.tdd.exercise.junit.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({ SlowTests.class, FastTests.class })
public class B {
	@Test
	public void c() {
		System.out.println("B-c");
	}
}