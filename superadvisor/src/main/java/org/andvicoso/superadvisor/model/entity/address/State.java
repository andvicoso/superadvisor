package org.andvicoso.superadvisor.model.entity.address;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "state")
public class State extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "country_id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private Country		country;

	@OneToMany(mappedBy = "state")
	private List<City>	cities;

	@Column(nullable = false)
	private String		name;

	@Column(nullable = false)
	private String		acronym;

	public String getAcronym() {
		return acronym;
	}

	public List<City> getCities() {
		return cities;
	}

	public Country getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

}
