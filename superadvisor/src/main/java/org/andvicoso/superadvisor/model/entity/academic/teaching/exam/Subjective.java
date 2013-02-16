package org.andvicoso.superadvisor.model.entity.academic.teaching.exam;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;

public class Subjective extends AbstractEntity {

	private String title;
	private String answer;
	private String body;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
