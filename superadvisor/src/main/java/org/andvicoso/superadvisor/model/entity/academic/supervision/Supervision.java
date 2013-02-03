package org.andvicoso.superadvisor.model.entity.academic.supervision;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.user.Student;
import org.andvicoso.superadvisor.model.entity.academic.user.Professor;
import org.andvicoso.superadvisor.model.entity.academic.work.AcademicWork;
import org.andvicoso.superadvisor.model.entity.meeting.Meeting;

@Entity
@Table(name = "supervision")
public class Supervision extends AbstractEntity {

	private String theme;
	private Professor advisor;
	private Professor coadvisor;
	private Student advisee;
	private Degree pursuedDegree;
	private Date start;
	private Date end;
	private Date max;
	private Collection<Meeting> meetings;
	private Collection<AcademicWork> academicWorks;

	public Professor getCoadvisor() {
		return coadvisor;
	}

	public void setCoadvisor(Professor coadvisor) {
		this.coadvisor = coadvisor;
	}

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	public Student getAdvisee() {
		return advisee;
	}

	public void setAdvisee(Student advisee) {
		this.advisee = advisee;
	}

	public Degree getPursuedDegree() {
		return pursuedDegree;
	}

	public void setPursuedDegree(Degree pursuedDegree) {
		this.pursuedDegree = pursuedDegree;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getMax() {
		return max;
	}

	public void setMax(Date max) {
		this.max = max;
	}

	public Collection<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Collection<Meeting> meetings) {
		this.meetings = meetings;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
