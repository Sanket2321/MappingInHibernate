package com.main;



import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Answer;
import com.entities.Question;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("/com/configure/hibernate.cfg.xml");
//		cfg.addAnnotatedClass(Question.class);
//		cfg.addAnnotatedClass(Answer.class);
		
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java");
		// creating answer

		Answer answer = new Answer();
		answer.setAns_id(343);
		answer.setAnswer("java is programming language");
		answer.setQues(q1);
		
        q1.setAnswer(answer);
        //Session
        Session s=factory.openSession();
         Transaction txTransaction=s.beginTransaction();
         s.save(q1);
         s.save(answer);
         
         txTransaction.commit();
         
         //fetch
         
        Question q= s.get(Question.class, 1212);
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().getAnswer());
         s.close();
         factory.close();
         
         
        
	}

}
