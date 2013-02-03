package org.andvicoso.superadvisor.model.entity;

import org.andvicoso.superadvisor.model.entity.address.Address;

public interface IPlace {

	public Address getAddress();

	public void setAddress(Address address);

	public String getName();

	public void setName(String name);

}
