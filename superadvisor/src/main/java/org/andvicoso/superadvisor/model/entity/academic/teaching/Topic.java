package org.andvicoso.superadvisor.model.entity.academic.teaching;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "topic")
public class Topic extends AbstractEntity {

	@Column(nullable = false)
	@NotEmpty(message = "O título deve ser preenchido.")
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
