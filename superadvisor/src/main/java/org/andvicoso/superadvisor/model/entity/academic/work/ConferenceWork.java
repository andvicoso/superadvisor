package org.andvicoso.superadvisor.model.entity.academic.work;

import org.andvicoso.superadvisor.model.entity.academic.conference.Conference;

public abstract class ConferenceWork extends AcademicWork {
	private Conference conference;

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

}
