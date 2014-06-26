package beginning.tdd.example.testdouble;

import java.util.ArrayList;
import java.util.Collection;

public class FakeUserRepositoryImpl implements UserRepository {
	private Collection<User> users = new ArrayList<User>();

	public void save(User user) {
		if (findById(user.getId()) == null) {
			users.add(user);
		}
	}

	public User findById(long id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	public User findByUsername(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}