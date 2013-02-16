package org.andvicoso.superadvisor.model.entity.academic.teaching.exam;

import java.util.Date;
import java.util.List;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.teaching.Course;
import org.andvicoso.superadvisor.model.entity.user.User;

public class Exam extends AbstractEntity {

	private Course course;
	private List<Question> questions;
	private List<Double> questionsValues;
	private Date date;
	private String obs;
	private User author;

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getTotalValue() {
		double sum = 0d;
		for (Double questionValue : questionsValues) {
			sum += questionValue;
		}

		return sum;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
