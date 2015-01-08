package beginning.tdd.sample.mvc.controller;

import static org.hamcrest.Matchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;

public class HomeControllerIntegrationTest extends AbstractMvcIntegrationTest {
	@Test
	public void testHome() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(forwardedUrl("/WEB-INF/views/home.jsp"))
				.andExpect(model().attribute("serverTime", any(String.class)));
		;
	}
}
