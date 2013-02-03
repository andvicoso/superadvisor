package org.andvicoso.superadvisor.model.entity.academic.user;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.academic.work.AcademicWork;
import org.andvicoso.superadvisor.model.entity.meeting.Meeting;

@Entity
@Table(name = "student")
public class Student extends AcademicUser {

	private Collection<Meeting> meetings;
	private Collection<AcademicWork> academicWorks;

}
