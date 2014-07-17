package beginning.tdd.exercise.testdouble.news;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ArticleServiceTimeTest {
	@Test
	public void Date를_ArticleServiceTime으로_반환할수있다() {
		ArticleServiceTime serviceTime = new ArticleServiceTime(new Date());

		assertThat(serviceTime.getForList(), containsString("분 전"));
	}

	@Test
	public void 년월일을_모두_표시할때는_YYYY점MM점DD_형식으로_한다() {
		Calendar fakeCurrent = createCalendarWith(2014, 6, 3, 23, 10);
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		assertThat(serviceTime.getYearMonthDay(), is("2014.07.03"));
	}

	/**
	 * 예) 02/03 (목)
	 */
	@Test
	public void 월일과_요일만_표기할때는_MM슬래쉬DD_괄호열고_요일_괄호닫기_형식으로_표시한다() {
		Calendar fakeCurrent = createCalendarWith(2014, 1, 3, 23, 10);
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		assertThat(serviceTime.getMonthDay(), is("02/03 (월)"));
	}

	/**
	 * 예) 오전 3:11, 오후 11:30, 오후 8:03
	 */
	@Test
	public void 시간만_표기할때는_오전이나_오후_다음으로_h콜론mm을붙여_표시한다() {
		Calendar fakeCurrent = createCalendarWith(2014, 1, 3, 20, 3);
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		assertThat(serviceTime.getHourMinute(), is("오후 8:03"));
	}

	@Test
	public void 분만_표기할때는_분_전_을붙여_표시한다() {
		Calendar fakeCurrent = createCalendarWith(2014, 1, 3, 20, 3);
		ArticleServiceTime serviceTime = new ArticleServiceTime(fakeCurrent.getTime());

		assertThat(serviceTime.getHourMinute(), is("오후 8:03"));
	}

	private Calendar createCalendarWith(int year, int month, int day, int hour, int minute) {
		Calendar result = Calendar.getInstance();
		result.set(year, month, day, hour, minute);
		return result;
	}
}
