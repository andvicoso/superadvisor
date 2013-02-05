package org.andvicoso.superadvisor.model.entity.academic.profile;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.andvicoso.superadvisor.model.entity.AbstractEntity;
import org.andvicoso.superadvisor.model.entity.academic.Degree;
import org.andvicoso.superadvisor.model.entity.academic.Institution;

@Entity
@Table(name = "academic_profile")
public abstract class AcademicProfile extends AbstractEntity {

	private List<Institution> institutions;
	private List<Degree> degrees;

	public List<Institution> getInstitutions() {
		return institutions;
	}

	public void setInstitutions(List<Institution> institutions) {
		this.institutions = institutions;
	}

	public List<Degree> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<Degree> degrees) {
		this.degrees = degrees;
	}

}
