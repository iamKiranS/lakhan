package com.hibernateupdateoperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StdMain {

	public static void main(String[] args) {

		System.out.println("application started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tc = session.beginTransaction();

//		Student student = session.load(Student.class,2);
//		session.delete(student);                                 delete operation
//		

		Student std = session.get(Student.class, 1);
		std.setName("Vaibhav");
		std.setCity("Chennai");

		session.update(std);
		tc.commit();
		session.close();

		System.out.println("successfully uploaded");
	}
}
