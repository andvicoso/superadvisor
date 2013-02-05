package org.andvicoso.superadvisor.model.entity.academic.supervision;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.Degree;
import org.andvicoso.superadvisor.model.entity.user.User;

@Entity
@Table(name = "supervision")
public class Supervision extends AbstractEntity {

	private String theme;
	private User supervisor;
	private User co_supervisor;
	private User student;
	private Degree pursuedDegree;
	private Date start;
	private Date end;
	private Date max;

	public User getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(User supervisor) {
		this.supervisor = supervisor;
	}

	public User getCo_supervisor() {
		return co_supervisor;
	}

	public void setCo_supervisor(User co_supervisor) {
		this.co_supervisor = co_supervisor;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
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

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
