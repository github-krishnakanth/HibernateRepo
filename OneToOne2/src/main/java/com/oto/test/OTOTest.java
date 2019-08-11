package com.oto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.entities.EmployementOffer;
import com.oto.entities.EmployementOfferPayRoll;
import com.oto.registry.SessionFactoryRegistry;

public class OTOTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		EmployementOffer eOffer = null;
		EmployementOfferPayRoll eRoll = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			eOffer = new EmployementOffer();
			eOffer.setOfferDate(new Date());
			eOffer.setCandidateName("Daniel Paul");
			eOffer.setCtc(890000f);
			eOffer.setDateOfJoin(new Date());
			eOffer.setDesignation("SE");
			eOffer.setEmailAddress("paul_daniel@icloud.com");
			eOffer.setMobileNo("4520141251");
			session.save(eOffer);
			
			eRoll = new EmployementOfferPayRoll();
			eRoll.setBasic(95000);
			eRoll.setHra(6000);
			eRoll.setPf(4500);
			eRoll.setMedicalClaimAmount(600000);
			eRoll.setSpecialAllowances(2500);
			eRoll.setEmployementOffer(eOffer);
			session.save(eRoll);
			
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
