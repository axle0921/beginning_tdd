package beginning.tdd.sample.mvc.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.web.servlet.ModelAndView;

import beginning.tdd.sample.mvc.AddressFixture;
import beginning.tdd.sample.mvc.model.Person;
import beginning.tdd.sample.mvc.repository.AddressRepository;

@RunWith(MockitoJUnitRunner.class)
public class AddressControllerTest {
	private AddressController sut;

	@Mock
	private AddressRepository mockAddressRepository;

	@Test
	public void testList() throws Exception {
		// given
		String someName = "아이유";
		Integer someAge = 21;
		List<Person> expectedAddress = AddressFixture.createFakeAddress(someName, someAge);
		when(mockAddressRepository.findBy()).thenReturn(expectedAddress);

		// when
		sut = new AddressController(mockAddressRepository);
		ModelAndView result = sut.list();
		List<Person> actualAdress = (List<Person>) getObject(result, "addresses");

		// then
		assertThat(actualAdress, is(expectedAddress));
	}

	@Test
	public void testAdd() throws Exception {
		// given
		String someName = "아이유";
		Integer someAge = 21;
		Person somePerson = AddressFixture.createFakePerson(someName, someAge);
		when(mockAddressRepository.add(somePerson)).thenReturn(anyLong());
		String expectedResult = "redirect:list";

		// when
		sut = new AddressController(mockAddressRepository);
		String actualResult = sut.add(somePerson);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	@Test
	public void testRemove() throws Exception {
		// given
		Long someId = 1L;
		doAnswer(new Answer<Void>() {
			@Override
			public Void answer(InvocationOnMock invocation) {
				Long someId = (Long) invocation.getArguments()[0];
				someId = 1L;
				return null;
			}
		}).when(mockAddressRepository).remove(someId);

		String expectedResult = "redirect:list";

		// when
		sut = new AddressController(mockAddressRepository);
		String actualResult = sut.remove(someId);

		// then
		assertThat(actualResult, is(expectedResult));
	}

	private Object getObject(ModelAndView result, String key) {
		Map<String, Object> model = result.getModel();

		assertThat(model.containsKey(key), is(true));

		return model.get(key);
	}
}
