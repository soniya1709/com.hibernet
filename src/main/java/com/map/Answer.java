package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
@Id
private int answerId;
private String answer;
@OneToOne(mappedBy="answer")
private Question question;
public Answer() {
	super();
}
public Answer(int answerId, String answer) {
	super();
	this.answerId = answerId;
	this.answer = answer;
}
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

}
