package com.lbs.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XMLHibernateSessionFactory {
	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration().configure("com/lbs/common/bootStrapping.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}
}
