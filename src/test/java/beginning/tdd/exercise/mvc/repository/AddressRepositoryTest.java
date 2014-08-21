package beginning.tdd.exercise.mvc.repository;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import beginning.tdd.exercise.mvc.model.Person;

public class AddressRepositoryTest extends AbstractDBIntegrationTest {
	@Autowired
	AddressRepository sut;

	@Test
	public void testAdd() {
		// given
		Person person = createPersonFixture();

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
		Person person = createPersonFixture();
		jdbcTemplate.update("INSERT INTO person (name, age) VALUES (?, ?)", person.getName(), person.getAge());

		// when
		List<Person> addresses = sut.findBy();

		// then
		assertThat(addresses.size(), greaterThan(1));
	}

	@Test
	public void testRemove() {
		// given
		Person person = createPersonFixture();
		jdbcTemplate.update("INSERT INTO person (name, age) VALUES (?, ?)", person.getName(), person.getAge());
		long lastIndex = jdbcTemplate.queryForLong("CALL IDENTITY()");

		// when
		sut.remove(lastIndex);
		int existedCount = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM person WHERE id = ?", lastIndex);

		// then
		assertThat(existedCount, is(0));
	}

	private Person createPersonFixture() {
		Person person = new Person();
		person.setName("아이유");
		person.setAge(22);
		return person;
	}
}
