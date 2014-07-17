package beginning.tdd.exercise.testdouble;

public interface UserRepository {
	void save(User user);

	User findById(long id);

	User findByUsername(String username);
}
