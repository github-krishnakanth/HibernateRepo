package com.company.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.company.entities.Company;

public class CompanyTest {
	public static void main(String[] args) {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Transaction tx = null;
		Session session = null;
		boolean flag = false;
		Company company = null;
		
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			company = new Company();
			
			/* 
			 * company.setCompanyName("Deloitte");
			 * company.setDescription("Product based Software Company");
			 * company.setEstablishedDate(new Date()); company.setLocation("Chennai");
			 * 
			 * session.persist(company);
			 * System.out.println("Company No: "+company.getCompanyNo());// null
			 */
			
			/*
			 * company.setCompanyName("TopLink");
			 * company.setDescription("Service based Software Company");
			 * company.setEstablishedDate(new Date()); company.setLocation("Pune"); int
			 * companyNo = (Integer)session.save(company);
			 * System.out.println("Company No: "+companyNo);
			 * System.out.println("Company No: "+company.getCompanyNo());
			 */
			
			/*
			 * company = (Company)session.get(Company.class, 2);
			 * System.out.println(company); 
			 * company.setLocation("Delhi");
			 * session.saveOrUpdate(company); System.out.println(company);
			 * System.out.println("Company No: "+company.getCompanyNo());
			 */
			
			/*
			 * company = (Company)session.get(Company.class, 2);
			 * System.out.println(company);
			 * System.out.println(company.getClass().getName());
			 * company.setLocation("Hyderabad"); session.update(company);
			 * System.out.println(company);
			 * System.out.println("Company No: "+company.getCompanyNo());
			 */
			 
			
			/* company = (Company)session.get(Company.class, 1); */
			/* One company object with id=1 atteched to the session */
			
			/* new Object company with the same id=1 */
			/*
			 * Company company1 = new Company();
			 * company1.setCompanyNo(company.getCompanyNo());
			 * company1.setCompanyName(company.getCompanyName());
			 * company1.setDescription("Service based Software Company");
			 * company1.setEstablishedDate(company.getEstablishedDate());
			 * company1.setLocation(company.getLocation()); session.merge(company1);
			 */
			
			/*
			 * company.setCompanyNo(5); 
			 * session.delete(company);
			 */
			
			/*
			 * company = (Company)session.load(Company.class, 6);
			 * company.setLocation("Noida");
			 * System.out.println(company.getClass().getName());
			 */
			
			company = (Company)session.get(Company.class, 6);
			session.close();
			//company will become detached
			
			company.setEstablishedDate(new Date());
			
			flag = true;
		}finally {
			if(tx!=null) {
				if(flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
			}
			if(session!=null) {
				session.close();
			}
			if(sessionFactory!=null) {
				sessionFactory.close();
			}
		}
	}
}
