package com.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1ton {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf=conf.configure("hibernet.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Question1ton q1=new Question1ton();
	q1.setQuestionId(555);
	q1.setQuestion("what is java?");
	Answer1ton ans1=new Answer1ton();
	ans1.setAnswerId(1111);
	ans1.setAnswer("Java is platform idependent");
    ans1.setQuestion(q1);
    Answer1ton ans2=new Answer1ton();
    ans2.setAnswerId(2222);
    ans2.setAnswer("Java is a object oriented language");
    ans2.setQuestion(q1);
    Session session=factory.openSession();
    Transaction tx=session.beginTransaction();
    session.save(q1);
    session.save(ans1);
    session.save(ans2);
    tx.commit();
    session.close();
    factory.close();
    
}
}
