package org.andvicoso.superadvisor.model.entity.academic;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.work.AcademicWork;

@Entity
@Table(name = "presentation")
public class Presentation extends AbstractEntity {

	private PresentationType type;
	private Institution institution;
	private AcademicWork work;
	private Date date;
	private Integer durationInMin;

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public AcademicWork getWork() {
		return work;
	}

	public void setWork(AcademicWork work) {
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
