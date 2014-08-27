package beginning.tdd.sample.legacy;

/**
 * 한 행동을 바꿀때 마다 그 행동의 정의되어 있는 서로 다른 서브클래스들을 전부 찾아서 코드를 일일히 고쳐야 하고, 그 과정에서 새로운 버그가 생길 가능성도 있다.
 */
public class ExtendedRedheadDuck extends OriginalDuck {

	@Override
	public String display() {
		return "RedheadDuck";
	}

}
