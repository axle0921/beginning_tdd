package beginning.tdd.exercise.junit.option;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest {
	public class User {
		private final String username;

		public User(String username) {
			this.username = username;
		}

		public String getUsername() {
			return this.username;
		}
	}

	@DataPoint
	public static String GOOD_USERNAME = "optimus";
	@DataPoint
	public static String USERNAME_WITH_SLASH = "optimus/prime";

	@Theory
	public void filenameIncludesUsername(String username) {
		assumeThat(username, not(containsString("/")));
		assertThat(new User(username).getUsername(), containsString(GOOD_USERNAME));
	}

	@Theory
	public void filenameIncludesUsernameWithSlash(String username) {
		assumeThat(username, is(containsString("/")));
		assertThat(new User(username).getUsername(), containsString(USERNAME_WITH_SLASH));
	}
}
