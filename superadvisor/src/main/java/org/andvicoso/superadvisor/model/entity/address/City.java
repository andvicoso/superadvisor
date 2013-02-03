package org.andvicoso.superadvisor.model.entity.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;

@Entity
@Table(name = "city")
public class City extends AbstractEntity {

	@Column(nullable = false)
	private String	name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "state_id")
	private State	state;

	public String getFullName() {
		return String.format("%1s (%2s)", getName(), getState().getAcronym());
	}

	public String getFullName2() {
		return String.format("%1s (%2s - %3s)", getName(), getState()
				.getAcronym(), getState().getCountry().getAcronym());
	}

	public String getName() {
		return name;
	}

	public State getState() {
		return state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(State state) {
		this.state = state;
	}

}
