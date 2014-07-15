package beginning.tdd.exercise.mockito;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class BasicMockitoTest {
	// mock creation
	// You can mock concrete classes, not only interfaces
	List mockedList = mock(List.class);
	LinkedList mockedLinkedList = mock(LinkedList.class);

	@Test
	public void testBehaviourVerification() {
		// using mock object
		mockedList.add("one");
		mockedList.clear();

		// verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}

	@Test
	public void testStubbing() {
		// stubbing
		when(mockedLinkedList.get(0)).thenReturn("first");
		when(mockedLinkedList.get(1)).thenThrow(new RuntimeException());

		// following prints "first"
		System.out.println(mockedLinkedList.get(0));

		// following throws runtime exception
		System.out.println(mockedLinkedList.get(1));

		// following prints "null" because get(999) was not stubbed
		System.out.println(mockedLinkedList.get(999));

		verify(mockedLinkedList).get(0);
	}

	@Test
	public void testStubbingConsecutiveCall1() {
		// stubbing
		when(mockedLinkedList.get(0)).thenThrow(new RuntimeException()).thenReturn("foo");

		// First call: throws runtime exception:
		mockedLinkedList.get(0);

		// Second call: prints "foo"
		System.out.println(mockedLinkedList.get(0));

		// Any consecutive call: prints "foo" as well (last stubbing wins).
		System.out.println(mockedLinkedList.get(0));
	}

	@Test
	public void testStubbingConsecutiveCall2() {
		// stubbing
		when(mockedLinkedList.get(0)).thenReturn("one", "two", "three");

		// First call: prints "one"
		System.out.println(mockedLinkedList.get(0));

		// Second call: prints "two"
		System.out.println(mockedLinkedList.get(0));

		// third call: prints "three"
		System.out.println(mockedLinkedList.get(0));
	}

	@Test
	public void testStubbingWithCallback() {
		when(mockedList.get(anyInt())).thenAnswer(new Answer() {
			public Object answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				Object mock = invocation.getMock();
				return "called with arguments: " + args;
			}
		});

		System.out.println(mockedList.get(0));
	}

	@Test
	public void testSpyingOnRealObject() {
		List list = new LinkedList();
		List spy = spy(list);

		// optionally, you can stub out some methods:
		when(spy.size()).thenReturn(100);

		// using the spy calls *real* methods
		spy.add("one");
		spy.add("two");

		// prints "one" - the first element of a list
		System.out.println(spy.get(0));

		// size() method was stubbed - 100 is printed
		System.out.println(spy.size());

		// optionally, you can verify
		verify(spy).add("one");
		verify(spy).add("two");
	}

	@Test
	public void testArgumentMatchers() {
		// stubbing using built-in anyInt() argument matcher
		when(mockedList.get(anyInt())).thenReturn("element");

		// following prints "element"
		System.out.println(mockedList.get(999));

		// you can also verify using an argument matcher
		verify(mockedList).get(anyInt());
	}

	@Test
	public void testVerifyingExactNumberOfInvocations() {
		mockedList.add("once");

		mockedList.add("twice");
		mockedList.add("twice");

		mockedList.add("three times");
		mockedList.add("three times");
		mockedList.add("three times");

		// following two verifications work exactly the same - times(1) is used
		// by default
		verify(mockedList).add("once");
		verify(mockedList, times(1)).add("once");

		// exact number of invocations verification
		verify(mockedList, times(2)).add("twice");
		verify(mockedList, times(3)).add("three times");

		// verification using never(). never() is an alias to times(0)
		verify(mockedList, never()).add("never happened");

		// verification using atLeast()/atMost()
		verify(mockedList, atLeastOnce()).add("three times");
		verify(mockedList, atLeast(2)).add("five times");
		verify(mockedList, atMost(5)).add("three times");
	}

	@Test
	public void testStubbingVoidMethodsWithExceptions() {
		doThrow(new RuntimeException()).when(mockedList).clear();

		// following throws RuntimeException:
		mockedList.clear();
	}

	@Test
	public void testVerifingZearoInteraction() {
		// using mocks - only mockOne is interacted
		mockedList.add("one");

		// ordinary verification
		verify(mockedList).add("one");

		// verify that method was never called on a mock
		verify(mockedList, never()).add("two");

		// verify that other mocks were not interacted
		// 복수의 경우 ',' 구분하여 검증. verifyZeroInteractions(mockTwo, mockThree);
		verifyZeroInteractions(mockedLinkedList);
	}

	@Test
	public void testFindingRedundantInvocation() {
		// using mocks
		mockedList.add("one");
		mockedList.add("two");

		verify(mockedList).add("one");

		// following verification will fail
		verifyNoMoreInteractions(mockedLinkedList);
	}
}