package beginning.tdd.exercise.legacy;

public class RefactoringToolQuirks {
	int x = 1;

	public int calculate(int y) {
		// return x+y;
		return plus(y);
	}

	/**
	 * x가 인스턴스 변수이므로 어떤 메소드를 추출하든 간에 메서드는 x를 사용할 수 있기 때문
	 */
	private int plus(int y) {
		return x + y;
	}
}
