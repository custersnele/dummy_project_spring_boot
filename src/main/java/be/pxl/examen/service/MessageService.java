package be.pxl.examen.service;

import be.pxl.examen.dao.MessageDao;
import be.pxl.examen.model.Message;
import be.pxl.examen.rest.resources.MessageResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

	@Autowired
	private MessageDao messageDao;

	public List<MessageResource> getMessages() {
		return messageDao.findAll().stream().map(this::mapMessageToMessageResource).collect(Collectors.toList());
	}

	private MessageResource mapMessageToMessageResource(Message message) {
		MessageResource result = new MessageResource();
		result.setId(message.getId());
		result.setText(message.getText());
		return result;
	}

	public long countMessages() {
		return messageDao.count();
	}
}
