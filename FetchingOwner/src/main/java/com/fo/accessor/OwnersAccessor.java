package com.fo.accessor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fo.entities.Owners;
import com.fo.registry.SessionFactoryRegistry;

public class OwnersAccessor {
	
	public Owners getOwner(int ownerNo) {
		Session session = SessionFactoryRegistry.getSessionFactory().openSession();
		Owners owner = session.get(Owners.class, ownerNo);
		return owner;
	}
	
	public int persistOwner(Owners owner) {
		Session session = SessionFactoryRegistry.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
		int ownerNo = (Integer)session.save(owner);
		tx.commit();
		return ownerNo;
		}catch(Exception e) {
			tx.rollback();
			return 0;
		}
	}
}
