package com.flc.accessor;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flc.entities.Staff;
import com.flc.registry.SessionFactoryRegistry;

public class StaffDaoImpl implements StaffDao{

	@Override
	public Staff getStaffDetails(int staffNo) throws Exception {
		Session session = null;
		Transaction transaction = null;
		Staff staff = null;
		try {
		session = SessionFactoryRegistry.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		staff = session.get(Staff.class, staffNo);
		transaction.commit();
		System.out.println("Transaction Committed...");
		
		return staff;
		
		}catch(Exception e) {
			transaction.rollback();
			System.out.println("Transaction Rollbacked...");
			throw new Exception(e);
		} finally { 
			if(transaction != null) { 
				transaction = null; 
			} 
			if(session != null) {
				session.close(); 
			} 
			SessionFactoryRegistry.closeSessionFactory(); 
		}
	}
}
