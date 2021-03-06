package com.fs.registry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("com/fs/cfg/hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
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
