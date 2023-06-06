package be.pxl.dummy.api.resources;

public class MessageDTO {
	private final Long id;
	private final String text;

	public MessageDTO(Long id, String text) {
		this.id = id;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}
}
