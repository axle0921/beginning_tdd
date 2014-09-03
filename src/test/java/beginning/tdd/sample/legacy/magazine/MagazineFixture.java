package beginning.tdd.sample.legacy.magazine;

public class MagazineFixture {
	public static Magazine createFakeMagazine(String category, int ranking, String name) {
		return new Magazine(category, ranking, name);
	}
}
