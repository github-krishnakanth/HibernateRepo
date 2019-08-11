package com.idg.registry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration().configure("com/idg/cfg/hibernate.cfg.xml");
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null && sessionFactory.isClosed()==false) {
			sessionFactory.close();
			sessionFactory=null;
		}
	}
}
