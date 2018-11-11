package com.survey.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SurveyAns {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String kin;
	private String name;
	private String question;
	private String answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKin() {
		return kin;
	}
	public void setKin(String kin) {
		this.kin = kin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
