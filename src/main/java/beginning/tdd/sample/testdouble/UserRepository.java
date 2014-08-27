package beginning.tdd.sample.testdouble;

public interface UserRepository {
	void add(User user);

	User findById(long id);

	User findByUsername(String username);
}
