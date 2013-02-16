package org.andvicoso.superadvisor.model.entity.academic.text;

import org.andvicoso.superadvisor.model.entity.user.User;

public abstract class AcademicDegreeText extends AcademicText {

	private AcademicDegreeTextType type;
	private User author;

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public AcademicDegreeTextType getType() {
		return type;
	}

	public void setType(AcademicDegreeTextType type) {
		this.type = type;
	}

}
