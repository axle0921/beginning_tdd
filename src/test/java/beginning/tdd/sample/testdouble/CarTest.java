package beginning.tdd.sample.testdouble;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Engine fakeSut;

	@Before
	public void setUp() {
		fakeSut = new FakeEngineImpl();
	}

	@Test
	public void engineIsStartedWhenCarStart() {
		new Car(fakeSut).start();

		assertThat(((FakeEngineImpl) fakeSut).isRunning(), is(true));
	}

	@Test
	public void engineIsStoppedWhenCarStop() {
		new Car(fakeSut).stop();

		assertThat(((FakeEngineImpl) fakeSut).isRunning(), is(false));
	}
}
