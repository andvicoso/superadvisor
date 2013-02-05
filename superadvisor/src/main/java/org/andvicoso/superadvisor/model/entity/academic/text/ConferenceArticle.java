package org.andvicoso.superadvisor.model.entity.academic.text;

import org.andvicoso.superadvisor.model.entity.academic.publication.conference.Conference;

public class ConferenceArticle extends Publication {
	private Conference conference;

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

}
