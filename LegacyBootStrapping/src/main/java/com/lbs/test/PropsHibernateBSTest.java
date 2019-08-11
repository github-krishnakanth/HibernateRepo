package com.lbs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lbs.entities.Event;
import com.lbs.helper.ProgHibernateSessionFactory;
import com.lbs.helper.PropsHibernateSessionFactory;

public class PropsHibernateBSTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Event event = null;
		
		try {
			sessionFactory = PropsHibernateSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			event = (Event)session.get(Event.class, 2);
			System.out.println(event);
		}finally {
			if(session!=null) {
				session.close();
			}
			ProgHibernateSessionFactory.closeSessionFactory();
		}
	}
}
