package com.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1ton {
@Id 
private int answerId;
private String answer;
@ManyToOne(cascade=CascadeType.ALL)
private Question1ton question;
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
public Question1ton getQuestion() {
	return question;
}
public void setQuestion(Question1ton question) {
	this.question = question;
}

}
