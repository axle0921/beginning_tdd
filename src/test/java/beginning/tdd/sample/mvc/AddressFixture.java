package beginning.tdd.sample.mvc;

import java.util.ArrayList;
import java.util.List;

import beginning.tdd.sample.mvc.model.Person;

public class AddressFixture {
	public static Person createFakePerson(String name, Integer age) {
		Person somePerson = new Person();
		somePerson.setId(100L);
		somePerson.setName(name);
		somePerson.setAge(age);

		return somePerson;
	}

	public static List<Person> createFakeAddress(String name, Integer age) {
		List<Person> somePersons = new ArrayList<Person>();
		somePersons.add(createFakePerson(name, age));

		return somePersons;
	}
}
