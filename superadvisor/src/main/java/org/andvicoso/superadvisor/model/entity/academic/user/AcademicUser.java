package org.andvicoso.superadvisor.model.entity.academic.user;

import org.andvicoso.superadvisor.model.entity.academic.Institution;
import org.andvicoso.superadvisor.model.entity.user.AbstractUser;

public abstract class AcademicUser extends AbstractUser {

	private Institution institution;

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

}
