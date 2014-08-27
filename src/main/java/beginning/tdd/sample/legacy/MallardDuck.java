package beginning.tdd.sample.legacy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public String display() {
		return "MallardDuck";
	}
}
