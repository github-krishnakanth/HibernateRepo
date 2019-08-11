package com.bs.registry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate5SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("com/bs/common/hibernate.cfg.xml").build();
		MetadataSources metadataSources = new MetadataSources(registry);
		MetadataBuilder builder = metadataSources.getMetadataBuilder();
		Metadata metadata = builder.build();
		sessionFactory = metadata.buildSessionFactory();
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
