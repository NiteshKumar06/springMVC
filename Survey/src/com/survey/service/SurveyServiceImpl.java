package com.survey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.Dao.SurveyDao;
import com.survey.entity.Question;
import com.survey.entity.SurveyAns;
import com.survey.model.SurveyAnswer;

@Service
public class SurveyServiceImpl implements SurveySevice {
	@Autowired
	SurveyDao surveyDao;

	@Override
	public List<SurveyAnswer> getAllQuestion() {
		List<SurveyAnswer> answers = new ArrayList<>();
		List<Question> questions = surveyDao.getAllQuestion();
		
		for (Question question : questions) {
			SurveyAnswer answer = new SurveyAnswer();
			answer.setId(question.getId());
			answer.setQuestion(question.getQuestion());
			answers.add(answer);
		}
		
		
		return answers;
	}

	@Override
	public void save(SurveyAns surveyAns) {
		surveyDao.saveSurveyRecord(surveyAns);
		
	}

}
