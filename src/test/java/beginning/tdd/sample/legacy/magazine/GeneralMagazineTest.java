package beginning.tdd.sample.legacy.magazine;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneralMagazineTest {
	// private GeneralMagazine sut;
	private RefactoredGenaralMagazine sut;

	@Before
	public void setUp() {
		// sut = new GeneralMagazine();
		sut = new RefactoredGenaralMagazine();
	}

	@Test
	public void 애완_1위_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "애완";
		int someRanking = 1;
		String someName = "월간 애완";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[최고의 애완 잡지]월간 애완";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 애완_10위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "애완";
		int someRanking = 10;
		String someName = "월간 애완";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[인기있는 애완 잡지]월간 애완";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 애완_30위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "애완";
		int someRanking = 30;
		String someName = "월간 애완";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[볼만한 애완 잡지]월간 애완";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 애완_순위외_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "애완";
		int someRanking = 40;
		String someName = "월간 애완";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[애완 잡지]월간 애완";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 자동차_1위_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "자동차";
		int someRanking = 1;
		String someName = "월간 자동차";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[최고의 자동차 잡지]월간 자동차";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 자동차_10위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "자동차";
		int someRanking = 10;
		String someName = "월간 자동차";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[인기있는 자동차 잡지]월간 자동차";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 자동차_30위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "자동차";
		int someRanking = 30;
		String someName = "월간 자동차";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[볼만한 자동차 잡지]월간 자동차";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 자동차_순위외_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "자동차";
		int someRanking = 40;
		String someName = "월간 자동차";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[자동차 잡지]월간 자동차";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 컴퓨터_1위_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "컴퓨터";
		int someRanking = 1;
		String someName = "월간 컴퓨터";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[최고의 컴퓨터 잡지]월간 컴퓨터";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 컴퓨터_10위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "컴퓨터";
		int someRanking = 10;
		String someName = "월간 컴퓨터";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[인기있는 컴퓨터 잡지]월간 컴퓨터";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 컴퓨터_30위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "컴퓨터";
		int someRanking = 30;
		String someName = "월간 컴퓨터";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[볼만한 컴퓨터 잡지]월간 컴퓨터";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 컴퓨터_순위외_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "컴퓨터";
		int someRanking = 40;
		String someName = "월간 컴퓨터";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[컴퓨터 잡지]월간 컴퓨터";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 스포츠_1위_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "스포츠";
		int someRanking = 1;
		String someName = "월간 스포츠";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[최고의 스포츠 잡지]월간 스포츠";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 스포츠_10위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "스포츠";
		int someRanking = 10;
		String someName = "월간 스포츠";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[인기있는 스포츠 잡지]월간 스포츠";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 스포츠_30위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "스포츠";
		int someRanking = 30;
		String someName = "월간 스포츠";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[볼만한 스포츠 잡지]월간 스포츠";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 스포츠_순위외_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "스포츠";
		int someRanking = 40;
		String someName = "월간 스포츠";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[스포츠 잡지]월간 스포츠";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 예술_1위_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "예술";
		int someRanking = 1;
		String someName = "월간 예술";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[최고의 예술 잡지]월간 예술";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 예술_10위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "예술";
		int someRanking = 10;
		String someName = "월간 예술";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[인기있는 예술 잡지]월간 예술";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 예술_30위이내_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "예술";
		int someRanking = 30;
		String someName = "월간 예술";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[볼만한 예술 잡지]월간 예술";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void 예술_순위외_잡지_제목만들기() throws Exception {
		// given
		String someCategory = "예술";
		int someRanking = 40;
		String someName = "월간 예술";
		Magazine magazine = MagazineFixture.createFakeMagazine(someCategory, someRanking, someName);
		String expectedResult = "[예술 잡지]월간 예술";

		// when
		String actualResult = sut.makeTitle(magazine);

		// then
		assertThat(actualResult, is(expectedResult));
	}
}
