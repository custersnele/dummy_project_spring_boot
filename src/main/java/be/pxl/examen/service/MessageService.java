package be.pxl.examen.service;

import be.pxl.examen.dao.MessageDao;
import be.pxl.examen.model.Message;
import be.pxl.examen.rest.resources.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

	private final MessageDao messageDao;

	public MessageService(MessageDao messageDao) {
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
