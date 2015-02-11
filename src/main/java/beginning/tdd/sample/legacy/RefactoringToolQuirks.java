package beginning.tdd.sample.legacy;

public class RefactoringToolQuirks {
	int someOne = 1;

	public int calculate(int someTwo) {
		// return someOne + someTwo;
		return plus(someTwo);
	}

	// someOne이 인스턴스 변수이므로 어떤 메소드를 추출하든 간에 메서드는 x를 사용할 수 있기 때문
	private int plus(int someTwo) {
		return someOne + someTwo;
	}
}
