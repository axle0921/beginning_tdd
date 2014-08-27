package beginning.tdd.sample.hamcrest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Test;

public class TypeOfHamcrestTest {
	/**
	 * allOf() - && 연산자처럼 한 부분이라도 다른 부분이 있으면 false 반환.
	 */
	@Test
	public void allOfExampleShowsAllMatchersMustAllBeTrue() throws Exception {
		assertThat("Hello", is(allOf(notNullValue(), instanceOf(String.class), equalTo("Hello"))));
	}

	@Test
	public void allOfExampleShowsFailingIfOneMatcherDoesNotMatch() throws Exception {
		assertThat("Hello", is(not(allOf(notNullValue(), instanceOf(Integer.class)))));
	}

	/**
	 * anyOf() - || 연산자처럼 한 부분이라도 일치하면 true를 반환.
	 */
	@Test
	public void anyOfExampleReturnsTrueIfOneMatches() throws Exception {
		assertThat("Hello", is(anyOf(nullValue(), instanceOf(String.class), equalTo("Goodbye"))));
	}

	@Test
	public void anyOfExampleFailingIfAllMatchersAreFalse() throws Exception {
		assertThat("Hello", is(not(anyOf(nullValue(), instanceOf(Integer.class), equalTo("Goodbye")))));
	}

	/**
	 * any() - 특정 유형의 클래스인지 확인한다.
	 */
	@Test
	public void anyExampleChecksThatClassIsOfSameType() throws Exception {
		assertThat("Hello", is(any(String.class)));
	}

	@Test
	public void anyExampleShowsStringIsAlsoAnObject() throws Exception {
		assertThat("Hello", is(any(Object.class)));
	}

	/**
	 * anything() - 어떠한 객체가 사용되든 항상 true를 반환한다.
	 */
	@Test
	public void anythingExampleAlwaysReturnsTrue() throws Exception {
		assertThat("Hello", is(anything()));
	}

	/**
	 * describedAs() - 테스트 실패시에 보여줄 추가적인 메시지를 만들어주는 메시지 데코레이터
	 */
	@Test
	public void describedAsExample() throws Exception {
		Matcher<?> matcher = describedAs("My Description", anything());
		Description description = new StringDescription().appendDescriptionOf(matcher);
		assertThat("My Description", is(description.toString()));
	}

	/**
	 * equalTo() - 두 객체가 동일한지 판별한다.
	 */
	@Test
	public void equalToExampleAddingTwoPlusTwo() throws Exception {
		assertThat(2 + 2, is(equalTo(4)));
	}

	/**
	 * instanceOf() - 동일한 인스턴스인지 타입 비교
	 */
	@Test
	public void instanceOfExampleForString() throws Exception {
		assertThat("Hello", is(instanceOf(String.class)));
	}

	/**
	 * is() - 내부적으로 equalTo 와 동일하다. 가독성 증진용.
	 */
	@Test
	public void isExampleShortCutForIsInstanceOfClass() throws Exception {
		assertThat("Hello", is(String.class));
		assertThat("Hello", instanceOf(String.class));
	}

	@Test
	public void isExampleShortCutAsJustSyntacticSugarUsedThreeTimes() throws Exception {
		assertThat("Hello", is(is(is(notNullValue()))));
	}

	@Test
	public void isExampleShortCutForIsEqualTo() throws Exception {
		assertThat("Hello", is("Hello"));
		assertThat("Hello", equalTo("Hello"));
	}

	/**
	 * not() - 서로 같지 않아야 한다.
	 */
	@Test
	public void notExampleJustInvertsExpression() throws Exception {
		assertThat("Hello", is(not(instanceOf(Integer.class))));
	}

	/**
	 * notNullValue() - null 이 아니다.
	 */
	@Test
	public void notNullValueExampleForString() throws Exception {
		assertThat("Hello", is(notNullValue()));
	}

	@Test
	public void notNullValueExampleForAClass() throws Exception {
		assertThat("Hello", is(notNullValue(Object.class)));
	}

	/**
	 * nullValue() - null 이다.
	 */
	@Test
	public void nullValueExampleWithANull() throws Exception {
		assertThat(null, is(nullValue()));
	}

	@Test
	public void nullValueExampleWithANullType() throws Exception {
		Integer nothing = null;
		assertThat(nothing, is(nullValue(Integer.class)));
	}

	/**
	 * sameInstance() - 오브젝트가 완전히 동일한지 비교(==).
	 */
	@Test
	public void sameInstanceExample() throws Exception {
		Object object = new Object();
		Object sameObject = object;
		assertThat(object, is(sameInstance(sameObject)));
	}
}
