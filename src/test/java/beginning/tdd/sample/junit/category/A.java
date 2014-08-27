package beginning.tdd.sample.junit.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {
	@Test
	public void a() {
		System.out.println("A-a");
	}

	@Category(SlowTests.class)
	@Test
	public void b() {
		System.out.println("A-b");
	}
}
