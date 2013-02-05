package org.andvicoso.superadvisor.model.entity.academic.publication.conference;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.profile.AcademicProfile;

public class ConferenceParticipation extends AbstractEntity {

	private AcademicProfile participant;
	private ConferenceRole role;
	private Conference conference;

	public AcademicProfile getParticipant() {
		return participant;
	}

	public void setParticipant(AcademicProfile participant) {
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
