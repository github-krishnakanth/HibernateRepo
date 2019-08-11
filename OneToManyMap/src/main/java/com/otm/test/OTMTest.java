package com.otm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.entities.Branch;
import com.otm.entities.Cheque;
import com.otm.util.SessionFactoryRegistry;

public class OTMTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Branch branch = null;
		Cheque cheque = null;
		Map<String, Cheque> chequeMap;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			chequeMap = new HashMap<String, Cheque>();
			
			  cheque = new Cheque(); cheque.setBorrowerName("Donald Trump");
			  cheque.setIssuedBy("Obama"); cheque.setIssuedDate(new Date());
			  cheque.setStatus("Processing"); cheque.setAmount(9000000);
			  session.save(cheque); chequeMap.put(UUID.randomUUID().toString(), cheque);
			  
			  cheque = new Cheque(); cheque.setBorrowerName("George Bush");
			  cheque.setIssuedBy("Lincoln"); cheque.setIssuedDate(new Date());
			  cheque.setStatus("Processing"); cheque.setAmount(10000000);
			  session.save(cheque); chequeMap.put(UUID.randomUUID().toString(), cheque);
			  
			  cheque = new Cheque(); cheque.setBorrowerName("Jimmy Carter");
			  cheque.setIssuedBy("Gerald Ford"); cheque.setIssuedDate(new Date());
			  cheque.setStatus("Processing"); cheque.setAmount(8000000);
			  session.save(cheque); chequeMap.put(UUID.randomUUID().toString(), cheque);
			  
			  branch = new Branch(); branch.setBranchName("WSCB");
			  branch.setBankName("SCB"); branch.setLocation("Chicago");
			  branch.setIfscCode("SCB001523"); branch.setChequeMap(chequeMap);
			  session.save(branch);
			
			/* branch = (Branch)session.get(Branch.class, 1); System.out.println(branch); */
			 
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
