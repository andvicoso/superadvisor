package org.andvicoso.superadvisor.model.entity.academic.teaching;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "course")
public class Course extends AbstractEntity {

	private List<Topic> topics;

	private String description;

	@Column(nullable = false)
	@NotEmpty(message = "O nome deve ser preenchido.")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
