package com.fha.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fha.entities.Product;
import com.fha.registry.HibernateSessionFactoryRegistry;

public class ProductDaoImpl implements ProductDao {

	@Override
	public int persistProduct(Product product) throws Exception {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			sessionFactory = HibernateSessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			int productNo = (Integer)session.save(product);
			tx.commit();
			System.out.println("Transaction Committed...");
			return productNo;
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Transaction Rollbacked because of below Exception...");
			throw new Exception(e.getMessage());
		}finally {
			if(session!=null) {
				session.close();
			}
			//HibernateSessionFactoryRegistry.closeSessionFactory();
		}
	}
}
