package org.andvicoso.superadvisor.model.repository;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

import org.andvicoso.superadvisor.model.entity.academic.teaching.Course;
import org.andvicoso.superadvisor.model.entity.academic.teaching.exam.Question;
import org.andvicoso.superadvisor.model.repository.base.AbstractRepositorySupport;

public class QuestionRepository extends AbstractRepositorySupport<Question> {

	public List<Question> listByCourse(Course course) {
		String hql = "from Question question where question.courseId = ?";
		return genericDAO.listByQuery(Question.class, hql, course.getId());
	}

	public List<Question> listByCourseExcluding(Course course,
			List<Question> questions) {
		Collection<Object> params = new ArrayList<Object>();
		Entry<String, List<Question>> qs = new SimpleEntry<String, List<Question>>(
				"questions", questions);

		params.add(course.getId());
		params.add(qs);

		String hql = "from Question question where question.courseId = ? and question not in (:questions)";
		return genericDAO.listByQuery(Question.class, hql, params);
	}

}
