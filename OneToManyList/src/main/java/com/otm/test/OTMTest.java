package com.otm.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.entities.Society;
import com.otm.entities.Staff;
import com.otm.util.SessionFactoryRegistry;

public class OTMTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Society society = null;
		Staff staff = null;
		List<Staff> lstaff = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			
			/*
			 * staff = new Staff(); lstaff = new ArrayList<Staff>();
			 * staff.setStaffFirstName("AAA"); staff.setStaffLastName("AAA");
			 * staff.setType("AAA"); staff.setContactNo("22525225");
			 * staff.setEmailAddress("AAA"); staff.setAddressLine1("AAA");
			 * staff.setAddressLine2("AAA"); staff.setCity("AAA"); staff.setState("AAA");
			 * staff.setZip(55224); staff.setCountry("AAA"); session.save(staff);
			 * lstaff.add(staff);
			 * 
			 * staff = new Staff(); staff.setStaffFirstName("BBB");
			 * staff.setStaffLastName("BBB"); staff.setType("BBB");
			 * staff.setContactNo("22525225"); staff.setEmailAddress("BBB");
			 * staff.setAddressLine1("BBB"); staff.setAddressLine2("BBB");
			 * staff.setCity("BBB"); staff.setState("BBB"); staff.setZip(55224);
			 * staff.setCountry("BBB"); session.save(staff); lstaff.add(staff);
			 * 
			 * society = new Society(); society.setSocietyName("Aparna Cyberperl");
			 * society.setRegisteredName("AAA"); society.setSocietyRegisteredDate(new
			 * Date()); society.setAddressLine1("AAA"); society.setAddressLine2("AAA");
			 * society.setCity("AAA"); society.setState("AAA"); society.setZip(1254);
			 * society.setCountry("AAA"); society.setContactNo("12514");
			 * society.setEmailAddress("AAA"); society.setStaffs(lstaff);
			 * session.save(society);
			 */
			
			  staff = (Staff)session.get(Staff.class, 1); 
			  System.out.println(staff);
			  
			  society = (Society)session.get(Society.class, 1);
			  System.out.println(society);
			
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
