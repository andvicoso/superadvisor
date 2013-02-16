package org.andvicoso.superadvisor.infra.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ValidationException extends RuntimeException {

	private List<String>	messages;

	public ValidationException() {
	}

	public ValidationException(Collection<String> messages) {
		this(null, messages);
	}

	public ValidationException(String... messages) {
		this(null, messages);
	}

	public ValidationException(Throwable cause, Collection<String> messages) {
		super(cause);
		this.messages = new ArrayList<String>(messages);
	}

	public ValidationException(Throwable cause, String... messages) {
		this(cause, Arrays.asList(messages));
	}

	@Override
	public String getMessage() {
		return super.getLocalizedMessage();
	}

	@Override
	public String getLocalizedMessage() {
		StringBuilder builder = new StringBuilder();
		for (String message : messages) {
			builder.append(message).append("\n");
		}
		return builder.toString();
	}

	public List<String> getLocalizedMessages() {
		return messages;
	}

	public List<String> getMessages() {
		return getLocalizedMessages();
	}

}
