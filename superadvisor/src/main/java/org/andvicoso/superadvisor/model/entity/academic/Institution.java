package org.andvicoso.superadvisor.model.entity.academic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.IPlace;
import org.andvicoso.superadvisor.model.entity.address.Address;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "institution")
public class Institution extends AbstractEntity implements IPlace {
	private Address address;

	@Column(nullable = false)
	@NotEmpty(message = "O nome deve ser preenchido.")
	private String name;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
