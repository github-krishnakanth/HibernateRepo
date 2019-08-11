package com.re.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.re.entities.Society;
import com.re.factory.SessionFactoryRegistry;

public class SocietyDaoImpl implements SocietyDao {
	SessionFactoryRegistry registry = SessionFactoryRegistry.getInstance();
	Session session = null;
	Transaction tx = null;
	@Override
	public int persist(Society society) {
		try {
		session = registry.getSessionFactory().openSession();
		tx = session.beginTransaction();
		int societyNo=(Integer)session.save(society);
		tx.commit();
		return societyNo;
		}catch(Exception e){
			tx.rollback();
			return 0;
		}
	}
}
