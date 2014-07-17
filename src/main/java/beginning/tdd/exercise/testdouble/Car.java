package beginning.tdd.exercise.testdouble;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.start();
	}

	public void stop() {
		engine.stop();
	}

	public void drive(Route route) {
		for (Directions directions : route.directions()) {
			directions.follow();
		}
	}
}
