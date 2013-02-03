package org.andvicoso.superadvisor.model.entity.academic.work;

import java.util.List;

import org.andvicoso.superadvisor.model.entity.academic.user.AcademicUser;

public abstract class AcademicWork {

	private String title;

	private String abstr;

	private List<AcademicUser> authors;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstr() {
		return abstr;
	}

	public void setAbstr(String abstr) {
		this.abstr = abstr;
	}

	public List<AcademicUser> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AcademicUser> authors) {
		this.authors = authors;
	}

	public AcademicUser getMainAuthor() {
		return authors.get(0);
	}
}
