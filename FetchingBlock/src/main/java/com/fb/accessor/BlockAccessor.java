package com.fb.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fb.entities.Block;
import com.fb.helper.HibernateSessionFactory;

public class BlockAccessor {
	
	public void getBlock(int blockNo) {
		//SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Block block = (Block)session.get(Block.class, blockNo);
		System.out.println(block);
		tx.commit();
	}
}
