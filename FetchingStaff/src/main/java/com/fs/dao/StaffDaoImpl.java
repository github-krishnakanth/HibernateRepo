package com.fs.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fs.entities.Staff;
import com.fs.registry.SessionFactoryRegistry;

public class StaffDaoImpl implements StaffDao {
	Session session = null;
	Staff staff = null;
	Transaction tx = null;
	@Override
	public Staff getStaff(int staffNo) {
		try {
		session = SessionFactoryRegistry.getSessionFactory().openSession();
		tx = session.beginTransaction();
		staff = session.get(Staff.class, staffNo);
		tx.commit();
		return staff;
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			return null;
		}
	}
}
