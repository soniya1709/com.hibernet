package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainManytoMany {
public static void main(String[] args) {
	Question q=new Question();
	q.setQname("what is the feature of java");

	
	Question q1=new Question();
	q1.setQname("what is JIT");
	
	
	Answer a=new Answer();
	a.setAnsName("java is platform independent");

	
	Answer a1=new Answer();
	a1.setAnsName("java is object oriented");
	
	Answer a2=new Answer();
	a2.setAnsName("Just in Time");
	
	List<Question> l1=new ArrayList();
	l1.add(q);
	a.setQuestion(l1);
	a1.setQuestion(l1);
	
	List<Question> l3=new ArrayList();
	l3.add(q1);
	a2.setQuestion(l3);
	
	List<Answer> l2=new ArrayList();
	l2.add(a);
	l2.add(a1);
	q.setAnswer(l2);
	
	List<Answer> l4=new ArrayList();
	l4.add(a2);
	q1.setAnswer(l4);
	
	Configuration conf=new Configuration();
	conf=conf.configure("hibernet.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(q);
	session.save(q1);
	tx.commit();
	session.close();
	factory.close();
	
}
}
