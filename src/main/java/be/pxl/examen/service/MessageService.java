package be.pxl.examen.service;

import be.pxl.examen.repository.MessageRepository;
import be.pxl.examen.rest.resources.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

	private final MessageRepository messageDao;

	public MessageService(MessageRepository messageDao) {
		this.messageDao = messageDao;
	}

	public List<MessageDTO> getMessages() {
		return messageDao.findAll().stream()
				.map(message -> new MessageDTO(message.getId(), message.getText()))
				.collect(Collectors.toList());
	}
	public long countMessages() {
		return messageDao.count();
	}
}
