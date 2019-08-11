package com.lbs.helper;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgHibernateSessionFactory {
	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = null;
		Properties props = null;
		
		props = new Properties();
		
		try {
			props.load(ProgHibernateSessionFactory.class.getClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		configuration = new Configuration();
		configuration.setProperty("hibernate.connection.driver_class", props.getProperty("db.driver_class"));
		configuration.setProperty("hibernate.connection.url", props.getProperty("db.url"));
		configuration.setProperty("hibernate.connection.username", props.getProperty("db.username"));
		configuration.setProperty("hibernate.connection.password", props.getProperty("db.password"));
		configuration.setProperty("hibernate.show_sql", "true");
		configuration.setProperty("hibernate.format_sql", "true");
		configuration.addResource("com/lbs/entities/Event.hbm.xml");
		
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
