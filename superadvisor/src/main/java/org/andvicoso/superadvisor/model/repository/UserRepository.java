package org.andvicoso.superadvisor.model.repository;

import java.util.Collection;

import org.andvicoso.superadvisor.model.entity.user.User;
import org.andvicoso.superadvisor.model.repository.base.AbstractRepositorySupport;

public class UserRepository extends AbstractRepositorySupport<User> {

	public Collection<User> listAdvisees(User pProfessor) {
		String hql = "select supervision.student from Supervision supervision where supervision.supervisor.id = ? or supervision.co_supervisor.id";
		return genericDAO.listByQuery(User.class, hql, pProfessor.getId(),
				pProfessor.getId());
	}

	public Collection<User> listSupervisors(User pStudent) {
		String hql = "select supervision.supervisor, supervision.co_supervisor, from Supervision supervision where supervision.student.id = ?";
		return genericDAO.listByQuery(User.class, hql, pStudent.getId());
	}

	public Collection<User> listCurrentSupervisors(User pStudent) {
		String hql = "select supervision.supervisor, supervision.co_supervisor, from Supervision supervision where supervision.student.id = ? and supervision.finished = false";
		return genericDAO.listByQuery(User.class, hql, pStudent.getId());
	}

}
