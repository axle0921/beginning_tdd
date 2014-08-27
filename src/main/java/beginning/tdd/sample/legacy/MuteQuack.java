package beginning.tdd.sample.legacy;

public class MuteQuack implements QuackBehavior {

	@Override
	public String quack() {
		return "MuteQuack";
	}

}
