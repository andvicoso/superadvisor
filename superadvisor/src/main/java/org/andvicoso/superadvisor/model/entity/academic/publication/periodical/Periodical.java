package org.andvicoso.superadvisor.model.entity.academic.publication.periodical;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;

public abstract class Periodical extends AbstractEntity {
	private String name;
	private Periodicity periodicity;

	public Periodicity getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(Periodicity periodicity) {
		this.periodicity = periodicity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
