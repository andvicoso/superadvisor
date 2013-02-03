package org.andvicoso.superadvisor.model.entity.academic.conference;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.user.AcademicUser;

public class ConferenceParticipation extends AbstractEntity {

	private AcademicUser participant;
	private ConferenceRole role;
	private Conference conference;

	public AcademicUser getParticipant() {
		return participant;
	}

	public void setParticipant(AcademicUser participant) {
		this.participant = participant;
	}

	public ConferenceRole getRole() {
		return role;
	}

	public void setRole(ConferenceRole role) {
		this.role = role;
	}

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

}
