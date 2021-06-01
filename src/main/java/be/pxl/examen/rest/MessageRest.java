package be.pxl.examen.rest;

import be.pxl.examen.rest.resources.MessageDTO;
import be.pxl.examen.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
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
