package com.fjpa.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fjpa.entities.Society;

public class FJPATest {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		Society society = new Society();
		boolean flag = false;
		
		society.setSocietyName("Lal Society");
		society.setRegisteredName("Lal Pro Society");
		society.setSocietyRegisteredDate(new Date());
		society.setAddressLine1("MG Road");
		society.setAddressLine2("Pune");
		society.setCity("Pune");
		society.setState("Maharashtra");
		society.setZip(560058);
		society.setCountry("India");
		society.setMobileNo("9666745434");
		society.setEmailAddress("lal_pro@gmail.com");
		
		try {
			emf = Persistence.createEntityManagerFactory("society_pu");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(society);
			flag = true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(et != null) {
				if(flag) {
					et.commit();
				}else {
					et.rollback();
				}
			}
			if(emf != null) {
				emf.close();
			}
		}
	}
}
