package com.jpag.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpag.entities.Player;

public class JPAGenTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		Player player = null;
		boolean flag = false;
		
		try {
			emf = Persistence.createEntityManagerFactory("player_pu");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			player = new Player();
			player.setPlayerName("ABD");
			player.setExperience(25);
			player.setMobileNo("+401-0136-254");
			player.setEmailAddress("ab_dev@gmail.com");
			em.persist(player);
			System.out.println("Record Inserted Successfully!");
			flag = true;
		}finally {
			if(et!=null) {
				if(flag) {
					et.commit();
				}else {
					et.rollback();
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
