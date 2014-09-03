package beginning.tdd.sample.legacy.magazine;

public class SportsTitle implements TitleMaker {
	@Override
	public String make(Magazine magazine) {
		if (magazine.getRanking() == 1) {
			return "[최고의 스포츠 잡지]";
		} else if (magazine.getRanking() <= 10) {
			return "[인기있는 스포츠 잡지]";
		} else if (magazine.getRanking() <= 30) {
			return "[볼만한 스포츠 잡지]";
		} else {
			return "[스포츠 잡지]";
		}
	}
}
