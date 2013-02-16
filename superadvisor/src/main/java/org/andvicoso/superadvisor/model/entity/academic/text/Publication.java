package org.andvicoso.superadvisor.model.entity.academic.text;

import java.util.Date;
import java.util.List;

import org.andvicoso.superadvisor.model.entity.user.User;

public abstract class Publication extends AcademicText {

	private List<User> authors;

	private Date publicationDate;

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public List<User> getAuthors() {
		return authors;
	}

	public void setAuthors(List<User> authors) {
		this.authors = authors;
	}

	public User getMainAuthor() {
		return authors.get(0);
	}
}
