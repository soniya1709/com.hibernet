package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1ton {
@Id
private int questionId;
private String question;
@OneToMany
private List<Answer1ton> answer;
public Question1ton() {
	super();
}
public Question1ton(int questionId, String question, List<Answer1ton> answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer1ton> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer1ton> answer) {
	this.answer = answer;
}

}
