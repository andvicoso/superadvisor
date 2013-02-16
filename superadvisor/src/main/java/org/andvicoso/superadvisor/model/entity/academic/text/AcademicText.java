package org.andvicoso.superadvisor.model.entity.academic.text;


public abstract class AcademicText {

	private String title;

	private String abstr;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstr() {
		return abstr;
	}

	public void setAbstr(String abstr) {
		this.abstr = abstr;
	}

}
