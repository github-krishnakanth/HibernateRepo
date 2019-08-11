package com.mtm.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtm.entities.Member;
import com.mtm.entities.Responsibility;
import com.mtm.util.SessionFactoryRegistry;

public class OTMTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Responsibility resp1   = null;
		Responsibility resp2 = null;
		Member member= null;
		Map<String, Responsibility> memberResponsibilities;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			memberResponsibilities = new HashMap<String, Responsibility>();
			
			/*
			 * resp1 = new Responsibility(); resp1.setDescription("Maintainance Finance");
			 * resp1.setResponsibilityType("Finance"); session.save(resp1);
			 * memberResponsibilities.put("Finance Director", resp1);
			 * 
			 * resp2 = new Responsibility(); resp2.setDescription("Cultural Committe");
			 * resp2.setResponsibilityType("Festival"); session.save(resp2);
			 * memberResponsibilities.put("Chief Operations", resp2);
			 * 
			 * member = new Member(); member.setMemberName("Susan");
			 * member.setContactNo("144-5214-5625");
			 * member.setEmailAddress("susan_lilly@icloud.com");
			 * member.setMemberResponsibilities(memberResponsibilities);
			 * session.save(member);
			 */
			
			member = (Member)session.get(Member.class, 1);
			System.out.println(member);
			
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
