package com.otomto.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otomto.entities.Flat;
import com.otomto.entities.Resident;
import com.otomto.registry.SessionFactoryRegistry;

public class OTOMTOTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Flat flat = null;
		Resident resident = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*
			 * flat = new Flat(); flat.setFlatType("3BHK"); flat.setDescription("Homely");
			 * flat.setFacing("East"); flat.setSqft(450); flat.setStatus("Available");
			 * session.save(flat);
			 * 
			 * resident = new Resident(); resident.setFirstName("Adam");
			 * resident.setLastName("Smith"); resident.setMobileNo("152414142");
			 * resident.setEmailAddress("smith_adam@icloud.com"); resident.setFlat(flat);
			 * session.save(resident);
			 */
			 
			  flat = (Flat)session.get(Flat.class, 1); 
			  System.out.println(flat);
			  
			  resident = (Resident)session.get(Resident.class, 1);
			  System.out.println(resident);
			 
			
			flag = true;
		}finally {
			if(transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if(session!=null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
