package beginning.tdd.exercise.legacy;

public abstract class Duck {
	/*
	 * 행동 변수는 행동 인터페이스 형식으로 선언. 같은 패키지에 속하는 모든 서브 클래스에서 이 변수를 상속받는다. 인스턴수 변수에는 실행시에 특정 행동에 대한 레퍼런스가 저장된다. 또한 모든 오리에는
	 * FlyBehavior, QuackBehavior 인터페이스를 구현하는 것에 대한 레퍼런스가 있다.
	 */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public abstract String display();

	public String performFly() {
		return flyBehavior.fly(); // 나는 행동을 직접처리하지 않고 flyBehavior를 참조되는 객체에 그 행동을 위임
	}

	public String performQuack() {
		return quackBehavior.quack();
	}

	public String swim() {
		return "swim";
	}
}
