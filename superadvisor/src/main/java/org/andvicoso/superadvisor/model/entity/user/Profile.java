package org.andvicoso.superadvisor.model.entity.user;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.andvicoso.superadvisor.model.Gender;
import org.andvicoso.superadvisor.model.entity.address.Address;

public class Profile {

	@OneToOne
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
