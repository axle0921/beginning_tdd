package beginning.tdd.sample.legacy.magazine;

public class CarTitle implements TitleMaker {
	@Override
	public String make(Magazine magazine) {
		if (magazine.getRanking() == 1) {
			return "[최고의 자동차 잡지]";
		} else if (magazine.getRanking() <= 10) {
			return "[인기있는 자동차 잡지]";
		} else if (magazine.getRanking() <= 30) {
			return "[볼만한 자동차 잡지]";
		} else {
			return "[자동차 잡지]";
		}
	}
}
