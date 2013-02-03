package org.andvicoso.superadvisor.model.entity.address;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.andvicoso.superadvisor.infra.util.StringUtils;
import org.hibernate.search.annotations.IndexedEmbedded;

@Embeddable
public class Address {

	public static String getValidString(String str, String pos) {
		if (StringUtils.isBlank(str))
			return "";
		return str + pos;
	}

	public static String getValidString(String pre, String str, String pos) {
		if (StringUtils.isBlank(str))
			return "";
		return pre + str + pos;
	}

	@ManyToOne
	@JoinColumn(name = "city_id")
	@IndexedEmbedded
	private City city;

	private String complement;

	private String number;

	private String street;

	private String district;

	private String zipCode;

	private Long lat;
	private Long lng;

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

	public Long getLng() {
		return lng;
	}

	public void setLng(Long lng) {
		this.lng = lng;
	}

	public City getCity() {
		return city;
	}

	public String getComplement() {
		return complement;
	}

	public Country getCountry() {
		if (getCity() != null && getCity().getState() != null) {
			return getCity().getState().getCountry();
		}
		return null;
	}

	public String getDistrict() {
		return district;
	}

	public String getMapsText() {
		if (getStreet() == null || getCity() == null)
			return "";

		return getValidString(getStreet().replaceAll(" ", "+"), ", ")
				+ getValidString("N. ", getNumber(), ".")
				+ getValidString(getCity().getFullName().replaceAll(" ", "+"),
						".");
	}

	public String getNumber() {
		return number;
	}

	public State getState() {
		if (getCity() != null) {
			return getCity().getState();
		}
		return null;
	}

	public String getStreet() {
		return street;
	}

	public String getText() {
		if (getStreet() == null || getCity() == null)
			return "";

		return getValidString(getStreet(), ", ")
				+ getValidString("N. ", getNumber(), "\n")
				+ getValidString("Compl. ", getComplement(), ", ")
				+ getValidString("Bairro: ", getDistrict(), "\n")
				+ getValidString("CEP: ", getZipCode(), "\n")
				+ getCity().getFullName();
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
