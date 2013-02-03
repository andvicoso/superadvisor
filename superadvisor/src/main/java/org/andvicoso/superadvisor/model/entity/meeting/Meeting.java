package org.andvicoso.superadvisor.model.entity.meeting;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.IPlace;
import org.andvicoso.superadvisor.model.entity.academic.user.Student;
import org.andvicoso.superadvisor.model.entity.academic.user.Professor;

@Entity
@Table(name = "meeting")
public class Meeting extends AbstractEntity implements Comparable<Date> {

	private Set<Student> advisees;

	private Professor advisor;
	
	private String subject;

	@Temporal(value = TemporalType.DATE)
	@Past(message = "Selecione uma data de nascimento válida.")
	private Date date;

	private IPlace place;

	private Integer durationInMin;

	public Set<Student> getAdvisees() {
		return advisees;
	}

	public void setAdvisees(Set<Student> advisees) {
		this.advisees = advisees;
	}

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public IPlace getPlace() {
		return place;
	}

	public void setPlace(IPlace place) {
		this.place = place;
	}

	public Integer getDurationInMin() {
		return durationInMin;
	}

	public void setDurationInMin(Integer duration) {
		this.durationInMin = duration;
	}

	@Override
	public int compareTo(Date o) {
		return getDate().compareTo(o);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
