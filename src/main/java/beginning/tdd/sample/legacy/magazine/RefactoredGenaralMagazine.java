package beginning.tdd.sample.legacy.magazine;

public class RefactoredGenaralMagazine {
	public static String makeTitle(Magazine magazine) throws Exception {
		Class<? extends TitleMaker> makerClass = MagazineType.makeTitleOf(magazine).getMakerClass();
		TitleMaker creator = makerClass.newInstance();

		StringBuffer result = new StringBuffer();
		result.append(creator.make(magazine));
		result.append(magazine.getName());

		return result.toString();
	}
}
