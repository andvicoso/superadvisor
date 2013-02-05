package org.andvicoso.superadvisor.model.entity.user;

import javax.persistence.Embedded;
import javax.persistence.OneToOne;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.profile.AcademicProfile;
import org.andvicoso.superadvisor.model.entity.auth.Login;
import org.andvicoso.superadvisor.model.entity.professional.profile.ProfessionalProfile;
import org.hibernate.search.annotations.IndexedEmbedded;

public class User extends AbstractEntity {
	@OneToOne
	@IndexedEmbedded
	private Login login;

	@Embedded
	private Profile profile;
	@OneToOne
	private AcademicProfile academicProfile;
	@OneToOne
	private ProfessionalProfile professionalProfile;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public AcademicProfile getAcademicProfile() {
		return academicProfile;
	}

	public void setAcademicProfile(AcademicProfile academicProfile) {
		this.academicProfile = academicProfile;
	}

	public ProfessionalProfile getProfessionalProfile() {
		return professionalProfile;
	}

	public void setProfessionalProfile(ProfessionalProfile professionalProfile) {
		this.professionalProfile = professionalProfile;
	}
}
