package beginning.tdd.sample.testdouble.mock;

import static org.mockito.BDDMockito.*;

import java.util.LinkedList;

import org.junit.Test;

public class BehaviorStyleTest {
	LinkedList mockedLinkedList = mock(LinkedList.class);

	@Test
	public void shouldBuyBread() throws Exception {
		// given
		given(mockedLinkedList.get(0)).willReturn("first");

		// when
		System.out.println(mockedLinkedList.get(0));

		// then
		verify(mockedLinkedList).get(0);
	}
}
