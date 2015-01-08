package beginning.tdd.sample.mvc.controller;

import static org.hamcrest.CoreMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;

public class AddressControllerIntegrationTest extends AbstractMvcIntegrationTest {
	@Test
	public void testList() throws Exception {
		mockMvc.perform(get("/sample/list")).andExpect(status().isOk()).andExpect(forwardedUrl("/WEB-INF/views/sample/list.jsp"))
				.andExpect(model().attribute("addresses", any(Object.class)));
	}

	@Test
	public void testAdd() throws Exception {
		String someName = "이종화";
		String someAge = "40";

		mockMvc.perform(post("/sample/add").param("name", someName).param("age", someAge)).andExpect(redirectedUrl("list"));
	}

	@Test
	public void testRemove() throws Exception {
		String someId = "1";

		mockMvc.perform(post("/sample/remove").param("id", someId)).andExpect(redirectedUrl("list"));
	}
}
