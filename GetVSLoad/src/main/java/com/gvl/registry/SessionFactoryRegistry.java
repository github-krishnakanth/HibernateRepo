package com.gvl.registry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("com/gvl/common/hibernate.cfg.xml").build()).
					getMetadataBuilder().build().buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null && sessionFactory.isClosed()==false) {
			sessionFactory.close();
			sessionFactory = null;
		}
	}
}
