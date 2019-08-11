package com.otomto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otomto.entities.School;
import com.otomto.entities.Student;
import com.otomto.util.SessionFactoryRegistry;

public class OTOMTOTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		School school = null;
		Student student = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*
			 * school = new School(); school.setSchoolName("Oxford High School");
			 * school.setDirector("Prof. Bernard Thomas"); school.setEstablishedDate(new
			 * Date()); school.setContactNo("12200009911");
			 * school.setEmailAddress("oxford_highprofile@icloud.com");
			 * session.save(school);
			 * 
			 * student = new Student(); student.setStudentName("Flynn Brave");
			 * student.setGender("Male"); student.setAge(11); student.setStudy("class 8");
			 * student.setContactNo("142587744");
			 * student.setEmailAddress("flynn_b@rediffmail.com"); student.setSchool(school);
			 * session.save(student);
			 */
			 
			  school = (School)session.get(School.class, 1); System.out.println(school);
			  
			  student = (Student)session.get(Student.class, 1);
			  System.out.println(student);
			 
			flag = true;
		}finally {
			if(transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if(session!=null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
