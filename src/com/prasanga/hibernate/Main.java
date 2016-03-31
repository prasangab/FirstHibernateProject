package com.prasanga.hibernate;

//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	
	public static void main(String []args){
		
		Student student = new Student();
		student.setStudent_name("Prasanga");
		
		Student_Details studentDetails = new Student_Details();
		studentDetails.setStudent_mobile_no("0717524500");
		
		//this is an important step
		studentDetails.setStudent(student);
		

		//student.setRollNo(1);
		//student2.setBirthDate(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentDetails);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
