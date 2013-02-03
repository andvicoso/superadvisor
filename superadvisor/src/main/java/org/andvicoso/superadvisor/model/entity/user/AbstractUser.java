package org.andvicoso.superadvisor.model.entity.user;

import javax.persistence.Embedded;
import javax.persistence.OneToOne;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.auth.Login;
import org.hibernate.search.annotations.IndexedEmbedded;

public abstract class AbstractUser extends AbstractEntity {
	@OneToOne
	@IndexedEmbedded
	private Login login;

	@Embedded
	private Profile profile;

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

}
