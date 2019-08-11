package com.tcc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tcc.entities.Account;
import com.tcc.entities.CurrentAccount;
import com.tcc.entities.SavingsAccount;
import com.tcc.registry.SessionFactoryRegistry;

public class TCCTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Account account = null;
		SavingsAccount sAccount = null;
		CurrentAccount cAccount = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*
			 * account = new Account(); account.setAccountHolderName("Luke");
			 * account.setBalance(6325.44f); account.setOpenedDate(new Date());
			 * session.save(account);
			 * 
			 * sAccount = new SavingsAccount(); sAccount.setAccountHolderName("Mathew");
			 * sAccount.setHasChequeBookFacility(true); sAccount.setBalance(5899.25f);
			 * sAccount.setOpenedDate(new Date()); sAccount.setMinBalance(1500.00f);
			 * sAccount.setMaxWithdrawsLimit(50000); session.save(sAccount);
			 * 
			 * cAccount = new CurrentAccount(); cAccount.setAccountHolderName("Paul");
			 * cAccount.setBalance(98525.25f); cAccount.setOpenedDate(new Date());
			 * cAccount.setOverDraftLimit(50000.00f);
			 * cAccount.setCompanyName("Keystone.info"); session.save(cAccount);
			 */
			
			/*
			 * sAccount = session.get(SavingsAccount.class, 2);
			 * System.out.println(sAccount);
			 */
			account = session.get(Account.class, 1);
			System.out.println(account);
			
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
