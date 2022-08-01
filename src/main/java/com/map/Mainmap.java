package com.map;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainmap {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("hibernet.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	
	Question q1=new Question();
	q1.setQuestionId(111);
	q1.setQuestion("what is java?");
	Answer ans=new Answer();
	ans.setAnswerId(11);
	ans.setAnswer("java is programming language");
	q1.setAnswer(ans);
	Question q2=new Question();
	q2.setQuestionId(121);
	q2.setQuestion("what is Framework?");
	Answer ans1=new Answer();
	ans1.setAnswerId(21);
	ans1.setAnswer("set of classes and interface");
	q2.setAnswer(ans1);

	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	s.save(q1);
	s.save(q2);
	s.save(ans);
	s.save(ans1);
	tx.commit();
	s.close();
	factory.close();
}
}
