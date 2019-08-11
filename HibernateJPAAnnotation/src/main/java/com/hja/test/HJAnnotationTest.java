package com.hja.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hja.entities.Staff;

public class HJAnnotationTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction transaction = null;
		Staff staff = null;
		boolean flag = false;
		
			staff = new Staff();
			staff.setStaffFirstNm("Smith");
			staff.setStaffLastNm("Steven");
			staff.setType("Mechanical Engineering");
			staff.setContactNo("9655566612");
			staff.setEmailAddress("steve_smith@gmail.com");
			staff.setAddressLine1("Sri Nagar Colony");
			staff.setAddressLine2("Banjara Hills");
			staff.setCity("Hyderabad");
			staff.setState("Telangana");
			staff.setZip(500018);
			staff.setCountry("India");
			staff.setSocietyNo(1006);
			
			emf = Persistence.createEntityManagerFactory("staff_pu");
			em = emf.createEntityManager();
			transaction = em.getTransaction();
			try {
				transaction.begin();
				em.persist(staff);
				
				flag = true;
			}catch(Exception e) {
			e.printStackTrace();
			}finally {
				if(transaction!=null) {
					if(flag) {
						transaction.commit();
					}else {
						transaction.rollback();
					}
				}
				if(em!=null) {
					em.close();
				}
				if(emf!=null) {
					emf.close();
				}
			}
		}
	}
