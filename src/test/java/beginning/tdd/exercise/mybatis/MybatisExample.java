package beginning.tdd.exercise.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
@Transactional
public class MybatisExample {

	@Autowired
	PersonRepository personRepository;
	
	@Test
	public void save() {
		Person person = new Person();
		person.setName("아이유");
		person.setAge(22);
		personRepository.save(person);
	}
	
	@Test
	public void findAge() throws Exception {
		save();
		List<Person> twenties = personRepository.findByAgeBetween(20, 30);
		for (Person person : twenties) {
			System.out.println(person);
		}
		assertEquals(1, twenties.size());
	}

}
