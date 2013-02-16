package org.andvicoso.superadvisor.model.entity.academic.text;

public abstract class PrintedPublication extends Publication {
	private Integer volume;
	private Integer issue;
	private Integer pages;

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getIssue() {
		return issue;
	}

	public void setIssue(Integer issue) {
		this.issue = issue;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

}
