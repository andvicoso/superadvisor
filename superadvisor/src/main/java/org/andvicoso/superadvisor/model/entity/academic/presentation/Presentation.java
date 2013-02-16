package org.andvicoso.superadvisor.model.entity.academic.presentation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.Place;
import org.andvicoso.superadvisor.model.entity.academic.text.AcademicDegreeText;

@Entity
@Table(name = "presentation")
public class Presentation extends AbstractEntity {

	private PresentationType type;
	private Place place;
	private AcademicDegreeText work;
	private Date date;
	private Integer durationInMin;

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public AcademicDegreeText getWork() {
		return work;
	}

	public void setWork(AcademicDegreeText work) {
		this.work = work;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDurationInMin() {
		return durationInMin;
	}

	public void setDurationInMin(Integer durationInMin) {
		this.durationInMin = durationInMin;
	}

	public PresentationType getType() {
		return type;
	}

	public void setType(PresentationType type) {
		this.type = type;
	}

}
