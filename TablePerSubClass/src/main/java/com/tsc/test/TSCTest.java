package com.tsc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsc.entities.CardPayment;
import com.tsc.entities.ChequePayment;
import com.tsc.entities.Payment;
import com.tsc.registry.SessionFactoryRegistry;

public class TSCTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Payment payment = null;
		CardPayment cPayment = null;
		ChequePayment chPayment = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*
			 * payment = new Payment(); payment.setPaymentDate(new Date());
			 * payment.setMerchantName("Big Bazar"); payment.setAmount(5000);
			 * session.save(payment);
			 * 
			 * cPayment = new CardPayment(); cPayment.setPaymentDate(new Date());
			 * cPayment.setMerchantName("BCC"); cPayment.setAmount(6500);
			 * cPayment.setCardNo("1419-5500-4162-0011");
			 * cPayment.setCardHolderName("Abraham"); cPayment.setBankName("SCB");
			 * session.save(cPayment);
			 * 
			 * chPayment = new ChequePayment(); chPayment.setPaymentDate(new Date());
			 * chPayment.setMerchantName("JBW"); chPayment.setAmount(9800);
			 * chPayment.setChequeIssuedDate(new Date()); chPayment.setChequeNo(45241);
			 * chPayment.setChequeIssuedName("Thomas"); session.save(chPayment);
			 */
			
			/*
			 * payment = (Payment)session.get(Payment.class, 1);
			 * System.out.println(payment);
			 */
			
			cPayment = (CardPayment)session.get(Payment.class, 2);
			System.out.println(cPayment);
			
			chPayment = (ChequePayment)session.get(Payment.class, 3);
			System.out.println(chPayment);
			
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
