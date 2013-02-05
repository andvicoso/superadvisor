package org.andvicoso.superadvisor.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.address.Address;

@Entity
@Table(name = "common_place")
public class CommonPlace implements Place {

	private Address address;
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
