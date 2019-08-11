package com.hhp.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hhp.entities.Employee;
import com.hhp.exception.DataNotPersistedException;
import com.hhp.registry.HibernateSessionFactoryRegistry;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int persistEmployee(Employee employee) throws DataNotPersistedException {
		Session session = HibernateSessionFactoryRegistry.getSessionFactroy().openSession();
		Transaction tx = session.beginTransaction();
		try {
			int employeeNo = (Integer)session.save(employee);
			tx.commit();
			System.out.println("Transaction Committed...");
			return employeeNo;
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Transaction Rollbacked...");
			throw new DataNotPersistedException(e.getMessage());
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("Session is closed...");
			}
			HibernateSessionFactoryRegistry.closeSessionFactory();
			System.out.println("SessionFactory is closed...");
		}
	}
}
