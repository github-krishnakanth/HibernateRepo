package com.re.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactoryRegistry instance;
	private static SessionFactory sessionFactory;
	
	private SessionFactoryRegistry() {
		sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("com/re/cfg/hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
	}
	
	public static synchronized SessionFactoryRegistry getInstance() {
		if(instance==null) {
			instance = new SessionFactoryRegistry();
		}
		return instance;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void closeSessionFactory() {
		if(sessionFactory!=null && sessionFactory.isClosed()==false) {
			sessionFactory.close();
			sessionFactory=null;
		}
	}
}
