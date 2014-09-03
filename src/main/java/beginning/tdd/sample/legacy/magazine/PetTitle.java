package beginning.tdd.sample.legacy.magazine;

public class PetTitle implements TitleMaker {
	@Override
	public String make(Magazine magazine) {
		if (magazine.getRanking() == 1) {
			return "[최고의 애완 잡지]";
		} else if (magazine.getRanking() <= 10) {
			return "[인기있는 애완 잡지]";
		} else if (magazine.getRanking() <= 30) {
			return "[볼만한 애완 잡지]";
		} else {
			return "[애완 잡지]";
		}
	}
}
