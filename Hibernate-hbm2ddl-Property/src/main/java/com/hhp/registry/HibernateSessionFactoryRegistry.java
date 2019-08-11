package com.hhp.registry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("com/hhp/cfg/hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactroy() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null && sessionFactory.isClosed()==false) {
			sessionFactory.close();
			sessionFactory=null;
		}
	}
}
