package beginning.tdd.exercise.testdouble.mock;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SingleVerificationTest {
	@Mock
	List singleMock;

	@Test
	public void testOrder() {
		// using a single mock
		singleMock.add("was added first");
		singleMock.add("was added second");

		// create an inOrder verifier for a single mock
		InOrder inOrder = Mockito.inOrder(singleMock);

		// following will make sure that add is first called with
		// "was added first, then with "was added second"
		inOrder.verify(singleMock).add("was added first");
		inOrder.verify(singleMock).add("was added second");
	}
}
