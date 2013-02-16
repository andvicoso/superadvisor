package org.andvicoso.superadvisor.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.andvicoso.superadvisor.model.entity.academic.teaching.Course;
import org.andvicoso.superadvisor.model.entity.academic.teaching.exam.Exam;
import org.andvicoso.superadvisor.model.entity.academic.teaching.exam.Question;
import org.andvicoso.superadvisor.model.repository.QuestionRepository;

public class ExamGenerator {

	private QuestionRepository questionRepository;

	public Exam generate(Course course, Exam oldExam, int numberOfQuestions) {
		List<Question> questions = questionRepository.listByCourseExcluding(
				course, oldExam.getQuestions());

		return createExam(course, numberOfQuestions, questions);
	}

	public Exam generate(Course course, int numberOfQuestions) {
		List<Question> questions = questionRepository.listByCourse(course);

		return createExam(course, numberOfQuestions, questions);
	}

	private Exam createExam(Course course, int numberOfQuestions,
			List<Question> questions) {
		Exam newExam = new Exam();
		List<Question> newQuestions = new ArrayList<Question>(numberOfQuestions);
		Random rand = new Random();
		for (int i = 0; i < numberOfQuestions; i++) {
			int pos = rand.nextInt(questions.size());
			newQuestions.add(questions.get(pos));
		}

		newExam.setQuestions(newQuestions);
		newExam.setCourse(course);

		return newExam;
	}
}
