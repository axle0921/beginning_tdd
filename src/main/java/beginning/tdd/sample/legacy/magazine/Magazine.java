package beginning.tdd.sample.legacy.magazine;

public class Magazine {
	private String category;
	private int ranking;
	private String name;

	public Magazine(String category, int ranking, String name) {
		this.category = category;
		this.ranking = ranking;
		this.name = name;
	}

	public String getCategory() {
		return this.category;
	}

	public int getRanking() {
		return this.ranking;
	}

	public Object getName() {
		return this.name;
	}
}
