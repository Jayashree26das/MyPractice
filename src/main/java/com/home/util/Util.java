package com.home.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.home.MyPractice.entity.Scholarship;
import com.home.MyPractice.entity.Students;

public class Util {
	public static SessionFactory getSessionFactory(){
		Configuration conf=new Configuration();
		//conf.addAnnotatedClass(User.class);
		conf.addAnnotatedClass(Scholarship.class);
		conf.addAnnotatedClass(Students.class);
		SessionFactory factory=conf.buildSessionFactory();
		return factory;
	}
}
