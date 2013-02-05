package org.andvicoso.superadvisor.model.entity.academic.text;

import org.andvicoso.superadvisor.model.entity.academic.profile.AcademicProfile;

public abstract class AcademicDegreeText {

	private AcademicProfile author;

	public AcademicProfile getAuthor() {
		return author;
	}

	public void setAuthor(AcademicProfile author) {
		this.author = author;
	}

}
