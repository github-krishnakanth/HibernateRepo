package com.cs.registry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import com.cs.helper.JDBCConnectionProviderImpl;
import com.cs.helper.initiator.JDBCConnectionProviderInitiator;

public class HibernateSessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(configuration.getProperties());
		//builder.addService(ConnectionProvider.class, new JDBCConnectionProviderImpl());
		builder.addInitiator(new JDBCConnectionProviderInitiator());
		StandardServiceRegistry registry = builder.build();
		sessionFactory = configuration.buildSessionFactory(registry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null && sessionFactory.isClosed()==false) {
			sessionFactory.close();
		}
	}
}
