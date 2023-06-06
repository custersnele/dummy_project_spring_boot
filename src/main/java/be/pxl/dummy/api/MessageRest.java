package be.pxl.dummy.api;

import be.pxl.dummy.api.resources.MessageDTO;
import be.pxl.dummy.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "messages")
public class MessageRest {

	private final MessageService messageService;

	public MessageRest(MessageService messageService) {
		this.messageService = messageService;
	}

	@GetMapping
	public List<MessageDTO> getMessages() {
		return messageService.getMessages();
	}

}
