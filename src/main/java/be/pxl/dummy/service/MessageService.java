package be.pxl.dummy.service;

import be.pxl.dummy.repository.MessageRepository;
import be.pxl.dummy.api.resources.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

	private final MessageRepository messageRepository;

	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}

	public List<MessageDTO> getMessages() {
		return messageRepository.findAll().stream()
				.map(message -> new MessageDTO(message.getId(), message.getText()))
				.collect(Collectors.toList());
	}
	public long countMessages() {
		return messageRepository.count();
	}
}
