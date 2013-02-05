package org.andvicoso.superadvisor.model.entity.academic.publication.conference;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.Institution;

@Entity
@Table(name = "conference")
public class Conference extends AbstractEntity {

	private String name;
	private String url;
	private Institution institution;
	private ConferenceType type;
	private Date initalDate;
	private Date finalDate;
	private Collection<Deadline> deadlines;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public Date getInitalDate() {
		return initalDate;
	}

	public void setInitalDate(Date initalDate) {
		this.initalDate = initalDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public Collection<Deadline> getDeadlines() {
		return deadlines;
	}

	public void setDeadlines(Collection<Deadline> deadlines) {
		this.deadlines = deadlines;
	}

	public ConferenceType getType() {
		return type;
	}

	public void setType(ConferenceType type) {
		this.type = type;
	}

}
