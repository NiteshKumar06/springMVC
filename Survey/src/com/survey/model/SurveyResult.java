package com.survey.model;

import java.util.List;

import com.survey.entity.Question;

public class SurveyResult {
	private List<SurveyAnswer> answers;
	
	private List<Question> questions;
	
	

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<SurveyAnswer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<SurveyAnswer> answers) {
		this.answers = answers;
	}
	
	

}
