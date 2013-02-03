package org.andvicoso.superadvisor.model.entity.user;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.andvicoso.superadvisor.model.Gender;

public class Profile {

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Temporal(value = TemporalType.DATE)
	@Past(message = "Selecione uma data de nascimento válida.")
	private Date birth;

	public Date getBirth() {
		return birth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
