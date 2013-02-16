package org.andvicoso.superadvisor.model.entity.academic.teaching.exam;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.teaching.Topic;

public abstract class Question extends AbstractEntity {

	private String title;
	private String answer;
	private String body;
	private Double recommendedValue;
	private Topic topic;

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

	public Double getRecommendedValue() {
		return recommendedValue;
	}

	public void setRecommendedValue(Double recommendedValue) {
		this.recommendedValue = recommendedValue;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
