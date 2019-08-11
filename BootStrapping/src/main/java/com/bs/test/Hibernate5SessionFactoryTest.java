package com.bs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bs.entities.Account;
import com.bs.registry.Hibernate5SessionFactoryRegistry;

public class Hibernate5SessionFactoryTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Account account = null;
		
		try {
		sessionFactory = Hibernate5SessionFactoryRegistry.getSessionFactory();
		session = sessionFactory.openSession();
		account = session.get(Account.class, 34452310);
		System.out.println(account);
		}finally {
			if(session!=null) {
				session.close();
			}
			Hibernate5SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
