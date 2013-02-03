package org.andvicoso.superadvisor.model.entity.address;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "country")
public class Country extends AbstractEntity {

	@OneToMany(mappedBy = "country")
	@NotNull
	private List<State>	states;

	@Column(nullable = false)
	@NotEmpty
	private String		name;

	@Column(nullable = false)
	@NotEmpty
	private String		acronym;

	public String getAcronym() {
		return acronym;
	}

	public String getName() {
		return name;
	}

	public List<State> getStates() {
		return states;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

}
