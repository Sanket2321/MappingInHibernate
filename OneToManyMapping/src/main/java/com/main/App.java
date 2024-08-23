package com.main;



import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Answer;
import com.entities.Question;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("/com/configure/hibernate.cfg.xml");
		cfg.addAnnotatedClass(Question.class);
	cfg.addAnnotatedClass(Answer.class);
		
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
		
		Answer answer1 = new Answer();
		answer1.setAns_id(34);
		answer1.setAnswer("with help of java we can create sw");
		answer1.setQues(q1);


        
        
        Answer answer2 = new Answer();
		answer2.setAns_id(33);
		answer2.setAnswer("java has large commudity");
		answer2.setQues(q1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		q1.setAnswers(list);
		


        //Session
        Session s=factory.openSession();
         Transaction txTransaction=s.beginTransaction();

         s.save(q1);
         s.save(answer);
         s.save(answer1);
         s.save(answer2);
         
         txTransaction.commit();
         
         //fetch
         
//        Question q= s.get(Question.class, 1212);
//        System.out.println(q.getQuestion());
//        System.out.println(q.getAnswer().getAnswer());
         s.close();
         factory.close();
         
         
        
	}

}
