package org.andvicoso.superadvisor.model.entity.meeting;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.Place;
import org.andvicoso.superadvisor.model.entity.user.User;

@Entity
@Table(name = "meeting")
public class Meeting extends AbstractEntity implements Comparable<Date> {

	private User requester;
	private Set<User> participants;
	private String subject;

	private Place place;

	@Temporal(value = TemporalType.DATE)
	@Past(message = "Selecione uma data válida.")
	private Date date;

	private Integer durationInMin;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
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

	public User getRequester() {
		return requester;
	}

	public void setRequester(User requester) {
		this.requester = requester;
	}

	public Set<User> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<User> participants) {
		this.participants = participants;
	}

}
