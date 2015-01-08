package beginning.tdd.sample.testdouble.news;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ArticleServiceTimeTest {
	@Test
	public void Date를_ArticleServiceTime으로_반환할수있다() {
		// given
		Date nowDate = new Date();

		// when
		ArticleServiceTime serviceTime = new ArticleServiceTime(nowDate);

		// then
		assertThat(serviceTime.getForList(), containsString("분 전"));
	}

	@Test
	public void 년월일을_모두_표시할때는_YYYY점MM점DD_형식으로_한다() {
		// given
		Calendar fakeCurrent = createCalendarWith(2014, 6, 3, 23, 10);

		// when
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		// then
		assertThat(serviceTime.getYearMonthDay(), is("2014.07.03"));
	}

	/**
	 * 예) 02/03 (목)
	 */
	@Test
	public void 월일과_요일만_표기할때는_MM슬래쉬DD_괄호열고_요일_괄호닫기_형식으로_표시한다() {
		// given
		Calendar fakeCurrent = createCalendarWith(2014, 1, 3, 23, 10);

		// when
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		// then
		assertThat(serviceTime.getMonthDay(), is("02/03 (월)"));
	}

	/**
	 * 예) 오전 3:11, 오후 11:30, 오후 8:03
	 */
	@Test
	public void 시간만_표기할때는_오전이나_오후_다음으로_h콜론mm을붙여_표시한다() {
		// given
		Calendar fakeCurrent = createCalendarWith(2014, 1, 3, 20, 3);

		// when
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		// then
		assertThat(serviceTime.getHourMinute(), is("오후 8:03"));
	}

	@Test
	public void 분만_표기할때는_분_전_을붙여_표시한다() {
		// given
		Calendar fakeCurrent = createCalendarWith(2014, 1, 3, 20, 3);

		// when
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		// then
		assertThat(serviceTime.getHourMinute(), is("오후 8:03"));
	}

	private Calendar createCalendarWith(int year, int month, int day, int hour, int minute) {
		Calendar result = Calendar.getInstance();
		result.set(year, month, day, hour, minute);

		return result;
	}
}
