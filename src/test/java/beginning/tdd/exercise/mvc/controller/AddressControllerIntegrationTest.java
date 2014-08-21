package beginning.tdd.exercise.mvc.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;

public class AddressControllerIntegrationTest extends AbstractMvcIntegrationTest {
	@Test
	public void testList() throws Exception {
		mockMvc.perform(get("/list")).andExpect(status().isOk()).andExpect(forwardedUrl("/WEB-INF/views/list.jsp"))
				.andExpect(model().attribute("addresses", any(Object.class)));
	}

	@Test
	public void testAdd() throws Exception {
		String someName = "이종화";
		String someAge = "40";

		mockMvc.perform(post("/add").param("name", someName).param("age", someAge)).andExpect(redirectedUrl("list"));
	}

	@Test
	public void testRemove() throws Exception {
		String someId = "1";

		mockMvc.perform(post("/remove").param("id", someId)).andExpect(redirectedUrl("list"));
	}
}
