package com.home.MyPractice.dao;

import org.hibernate.Session;

import com.home.MyPractice.entity.Students;
import com.home.util.Util;

public class ServiceDaoImpl implements ServiceDao {
	@Override
	public void saveStudents(Students s) {
		System.out.println("inside ServiceDaoImpl");
		Session ses=Util.getSessionFactory().openSession();
		System.out.println(ses);
		ses.beginTransaction();
		ses.save(s);
		ses.getTransaction().commit();
		ses.close();
		System.out.println("so far so good");
	}

}
