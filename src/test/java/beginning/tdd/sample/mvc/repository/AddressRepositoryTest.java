package beginning.tdd.sample.mvc.repository;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import beginning.tdd.sample.mvc.AddressFixture;
import beginning.tdd.sample.mvc.model.Person;

public class AddressRepositoryTest extends AbstractDBIntegrationTest {
	@Autowired
	AddressRepository sut;

	@Test
	public void testAdd() {
		// given
		String someName = "아이유";
		Integer someAge = 22;
		Person person = AddressFixture.createFakePerson(someName, someAge);

		// when
		long insertRowCount = sut.add(person);
		long lastIndex = person.getId();
		int existedCount = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM person WHERE id = ?", lastIndex);

		// then
		assertThat(insertRowCount, is(1L));
		assertThat(existedCount, is(1));
	}

	@Test
	public void testFindBy() {
		// given
		String someName = "아이유";
		Integer someAge = 22;
		jdbcTemplate.update("INSERT INTO person (name, age) VALUES (?, ?)", someName, someAge);

		// when
		List<Person> addresses = sut.findBy();

		// then
		assertThat(addresses.size(), greaterThan(1));
	}

	@Test
	public void testRemove() {
		// given
		String someName = "아이유";
		Integer someAge = 22;
		jdbcTemplate.update("INSERT INTO person (name, age) VALUES (?, ?)", someName, someAge);
		long lastIndex = jdbcTemplate.queryForLong("CALL IDENTITY()");

		// when
		sut.remove(lastIndex);
		int existedCount = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM person WHERE id = ?", lastIndex);

		// then
		assertThat(existedCount, is(0));
	}
}
