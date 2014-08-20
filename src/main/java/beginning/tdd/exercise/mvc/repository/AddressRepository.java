package beginning.tdd.exercise.mvc.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import beginning.tdd.exercise.mvc.model.Person;

@Repository
public interface AddressRepository {
	public Long add(Person person) throws DataAccessException;

	public List<Person> findBy() throws DataAccessException;

	public void remove(Long id) throws DataAccessException;
}
