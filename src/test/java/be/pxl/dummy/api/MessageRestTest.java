package be.pxl.dummy.api;

import be.pxl.dummy.api.resources.MessageDTO;
import be.pxl.dummy.service.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = MessageRest.class)
public class MessageRestTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private MessageService messageService;

	@Test
	void returnsMessages() throws Exception {

		when(messageService.getMessages()).thenReturn(Arrays.asList(new MessageDTO(5L, "message1"), new MessageDTO(9L, "message2")));

		var expectedJson = "[{\"id\" : 5, \"text\" : \"message1\"},  {\"id\" : 9, \"text\" : \"message2\"}]";

		mockMvc.perform(get("/messages")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(expectedJson));
	}
}
