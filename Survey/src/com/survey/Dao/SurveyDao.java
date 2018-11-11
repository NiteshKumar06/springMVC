package com.survey.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.survey.entity.Question;
import com.survey.entity.SurveyAns;

@Repository
public class SurveyDao {
	@Autowired 
	private SessionFactory sessionFactory;
	
	public List<Question> getAllQuestion(){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Question.class);
		List<Question> questions = criteria.list();
		return questions;
	}
	
	@Transactional
	public void saveSurveyRecord(SurveyAns surveyAns){
		Session session = sessionFactory.openSession();
		session.save(surveyAns);
	}

}
