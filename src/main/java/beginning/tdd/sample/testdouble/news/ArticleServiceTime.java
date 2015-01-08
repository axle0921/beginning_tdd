package beginning.tdd.sample.testdouble.news;

import static org.apache.commons.lang.time.DateUtils.isSameDay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import beginning.tdd.BaseObject;

@SuppressWarnings("serial")
public class ArticleServiceTime extends BaseObject {
	private Date rawServiceTime;

	public ArticleServiceTime(Date rawServiceTime) {
		this.rawServiceTime = rawServiceTime;
	}

	public String getForList() {
		return getForList(System.currentTimeMillis());
	}

	public String getForList(long current) {
		final int oneHour = 1000 * 60 * 60;

		long difference = current - rawServiceTime.getTime();

		if (isFuture(difference)) {
			return "1분 전";
		} else if (isNotSameDay(rawServiceTime.getTime(), current)) {
			return getYearMonthDay();
		} else if (difference > oneHour) {
			return getHourMinute();
		} else {
			return getMinuteFrom(difference) + "분 전";
		}
	}

	String getYearMonthDay() {
		return new SimpleDateFormat("yyyy.MM.dd", Locale.KOREAN).format(new Date(rawServiceTime.getTime()));
	}

	String getMonthDay() {
		return new SimpleDateFormat("MM/dd (E)", Locale.KOREAN).format(new Date(rawServiceTime.getTime()));
	}

	String getHourMinute() {
		return new SimpleDateFormat("a h:mm", Locale.KOREAN).format(new Date(rawServiceTime.getTime()));
	}

	long getMinuteFrom(long difference) {
		final int oneMinite = 1000 * 60;
		if (difference < oneMinite) {
			return 1;
		}
		return difference / 60 / 1000;
	}

	private boolean isFuture(long difference) {
		return difference < 0;
	}

	private boolean isNotSameDay(long feedingTime, long current) {
		return isSameDay(new Date(feedingTime), new Date(current)) == false;
	}
}
