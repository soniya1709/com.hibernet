package com.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int questionId;
	String qname;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Answer> answer;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", qname=" + qname + ", answer=" + answer + "]";
	}

}
