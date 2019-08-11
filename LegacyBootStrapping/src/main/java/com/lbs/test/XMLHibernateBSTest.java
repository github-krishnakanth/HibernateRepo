package com.lbs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lbs.entities.Event;
import com.lbs.helper.XMLHibernateSessionFactory;

public class XMLHibernateBSTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Event event = null;
		
		try {
			sessionFactory = XMLHibernateSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			event = (Event)session.get(Event.class, 4);
			System.out.println(event);
		}finally {
			if(session!=null) {
				session.close();
			}
			XMLHibernateSessionFactory.closeSessionFactory();  
		}
	}
}
