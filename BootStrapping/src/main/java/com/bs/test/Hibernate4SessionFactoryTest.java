package com.bs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bs.entities.Account;
import com.bs.registry.Hibernate4SessionFactoryRegistry;

public class Hibernate4SessionFactoryTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Account account = null;
		
		try {
			sessionFactory = Hibernate4SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			account = session.get(Account.class, 34410233);
			System.out.println(account);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
			/* Hibernate4SessionFactoryRegistry.closeSessionFactory(); */
		}
	}
}
