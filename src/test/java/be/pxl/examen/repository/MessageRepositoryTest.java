package be.pxl.examen.repository;

import be.pxl.examen.model.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class MessageRepositoryTest {

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private MessageRepository messageDao;

	@BeforeEach
	void init() {
		Message message1 = new Message("message1");
		Message message2 = new Message("message1");
		testEntityManager.persist(message1);
		testEntityManager.persist(message2);
		testEntityManager.flush();
		testEntityManager.clear();
	}

	@Test
	void findAllMessages() {
		List<Message> allMessages = messageDao.findAll();
		assertNotNull(allMessages);
		assertEquals(2, allMessages.size());
	}
}
