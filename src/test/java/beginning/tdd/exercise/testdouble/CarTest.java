package beginning.tdd.exercise.testdouble;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import beginning.tdd.exercise.testdouble.Car;
import beginning.tdd.exercise.testdouble.Engine;

public class CarTest {
	@Test
	public void engineIsStartedWhenCarStart() {
		Engine engine = new FakeEngineImpl();

		new Car(engine).start();

		assertThat(((FakeEngineImpl) engine).isRunning(), is(true));
	}

	@Test
	public void engineIsStoppedWhenCarStop() {
		Engine fakeEngine = new FakeEngineImpl();

		new Car(fakeEngine).stop();

		assertThat(((FakeEngineImpl) fakeEngine).isRunning(), is(false));
	}
}