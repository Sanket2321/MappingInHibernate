package com.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import javax.persistence.OneToMany;
@Entity
public class Answer 
 {
	@Id
	@Column(name="ans_id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ans_id;
	private String answer;
	@ManyToOne
	 private Question ques;
	
	public Question getQues() {
		return ques;
	}
	public void setQues(Question ques) {
		this.ques = ques;
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}
	

}
