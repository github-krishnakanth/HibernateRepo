package com.oto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.entities.Admission;
import com.oto.entities.Scholarship;
import com.oto.registry.SessionFactoryRegistry;

public class OTOTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Admission admission = null;
		Scholarship scholarship = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*
			 * admission = new Admission(); admission.setAdmissionDate(new Date());
			 * admission.setCandidateName("Jack Reacher"); admission.setCollege("CBIT");
			 * admission.setDegree("BSC"); admission.setDob(new Date());
			 * admission.setGender("Male"); session.save(admission);
			 * 
			 * scholarship = new Scholarship(); scholarship.setCategory("OBC");
			 * scholarship.setSanctionedAmount(8500); scholarship.setSanctionedDate(new
			 * Date()); scholarship.setScholarshipType("Yearly");
			 * scholarship.setAdmission(admission); session.save(scholarship);
			 */
				
			admission = (Admission)session.get(Admission.class, 1);
			System.out.println(admission);
			
			scholarship = (Scholarship)session.get(Scholarship.class, 1);
			System.out.println(scholarship);
			
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
