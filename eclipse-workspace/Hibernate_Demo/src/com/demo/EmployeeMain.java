package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {

		System.out.println("Hii");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();

		Employee employee = new Employee();
		employee.setUsername("vijay");
		employee.setPassword("vijay@123");

		session.save(employee);

		ts.commit();
		session.close();

		System.out.println("successfully uploaded");
	}
}
