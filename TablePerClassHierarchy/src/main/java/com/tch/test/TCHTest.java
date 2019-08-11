package com.tch.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tch.entities.AccidentalPlan;
import com.tch.entities.InsurancePlan;
import com.tch.entities.MedicalPlan;
import com.tch.registry.SessionFactoryRegistry;

public class TCHTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		InsurancePlan iPlan = null;
		AccidentalPlan aPlan = null;
		MedicalPlan mPlan = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*
			 * iPlan = new InsurancePlan(); iPlan.setPlanName("Basic Plan");
			 * iPlan.setMinTenure(10); iPlan.setMaxAge(55); session.save(iPlan);
			 * 
			 * aPlan = new AccidentalPlan(); aPlan.setPlanName("Accidental Basic Plan");
			 * aPlan.setMinTenure(20); aPlan.setMaxAge(60);
			 * aPlan.setDisabilityCoverage(true); aPlan.setInternationalCoverage(false);
			 * aPlan.setThirdPartyCoverage(false); session.save(aPlan);
			 * 
			 * mPlan = new MedicalPlan(); mPlan.setPlanName("Medical Basic Plan");
			 * mPlan.setMinTenure(15); mPlan.setMaxAge(70); mPlan.setCopay(10);
			 * mPlan.setCoverageType("In-Patient"); mPlan.setNetworkType("In-Network");
			 * session.save(mPlan);
			 */
			 
			  iPlan = (InsurancePlan)session.get(InsurancePlan.class, 1);
			  System.out.println(iPlan);
			  
			  aPlan = (AccidentalPlan)session.get(AccidentalPlan.class, 2);
			  System.out.println(aPlan);
			  
			  mPlan = (MedicalPlan)session.get(MedicalPlan.class, 3);
			  System.out.println(mPlan);
			
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
