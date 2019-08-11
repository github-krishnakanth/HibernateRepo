package com.idg.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.idg.entities.Society;
import com.idg.exception.DataNotPersistedException;
import com.idg.registry.HibernateSessionFactoryRegistry;

public class SocietyDaoImpl implements SocietyDao {

	@Override
	public int PersistSociety(Society society) throws DataNotPersistedException {
		Session session = HibernateSessionFactoryRegistry.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			int societyNo = (Integer)session.save(society);
			tx.commit();
			System.out.println("Transaction Committed...");
			return societyNo;
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Transaction Rollbacked...");
			throw new DataNotPersistedException(e.getMessage());
		}finally {
			if(session!=null) {
				session.close();
			}
			HibernateSessionFactoryRegistry.closeSessionFactory();
		}
	}
}
