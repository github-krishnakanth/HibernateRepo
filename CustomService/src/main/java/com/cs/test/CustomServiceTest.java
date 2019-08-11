package com.cs.test;

import org.hibernate.Session;

import com.cs.entities.Loan;
import com.cs.registry.HibernateSessionFactoryRegistry;

public class CustomServiceTest {

	public static void main(String[] args) {
		Session session = null;
		Loan loan = null;
		
		try {
			session = HibernateSessionFactoryRegistry.getSessionFactory().openSession();
			loan = session.get(Loan.class, 2);
			System.out.println(loan);
		}finally {
			if(session!=null) {
				session.close();
			}
			HibernateSessionFactoryRegistry.closeSessionFactory();
		}
	}
}
