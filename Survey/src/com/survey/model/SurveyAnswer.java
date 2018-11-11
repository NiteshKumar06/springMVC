package com.survey.model;


public class SurveyAnswer {
	
	private int id;
	private String question;
	private String vote;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}

}
