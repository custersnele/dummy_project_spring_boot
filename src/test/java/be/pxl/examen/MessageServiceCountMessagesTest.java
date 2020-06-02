package be.pxl.examen;

import be.pxl.examen.dao.MessageDao;
import be.pxl.examen.service.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MessageServiceCountMessagesTest {

	@Mock
	private MessageDao messageDao;
	@InjectMocks
	private MessageService messageService;

	@Test
	public void returnsNumberOfCountedDroneflights() {
		when(messageDao.count()).thenReturn(5L);

		assertEquals(5L, messageService.countMessages());
	}

}
