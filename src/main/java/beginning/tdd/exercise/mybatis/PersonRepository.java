package beginning.tdd.exercise.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.Rule;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository {
	
	public Long save(Person person) throws DataAccessException;
	
	public List<Person> findByAgeBetween(@Param(value="greaterEquals") int greaterEquals, @Param(value="lesserThan") int lesserThan) throws DataAccessException;
	
	public Rule findOne(Long id) throws DataAccessException;

}
