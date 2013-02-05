package org.andvicoso.superadvisor.model.entity.academic.text;

import org.andvicoso.superadvisor.model.entity.academic.publication.periodical.Journal;

public class JournalArticle extends PrintedPublication {

	private Journal journal;

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

}
