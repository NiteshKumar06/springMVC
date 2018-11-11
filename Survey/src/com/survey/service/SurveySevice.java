package com.survey.service;

import java.util.List;

import com.survey.entity.SurveyAns;
import com.survey.model.SurveyAnswer;

public interface SurveySevice {
	
	List<SurveyAnswer> getAllQuestion();
	
	void save(SurveyAns surveyAns);

}
