package com.mtm.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtm.entities.Job;
import com.mtm.entities.Skill;
import com.mtm.util.SessionFactoryRegistry;

public class OTMTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Skill skill = null;
		Skill skill1 = null;
		Skill skill2 = null;
		Job job = null;
		Set<Skill> skills = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			skills = new HashSet<Skill>();
			
			/*
			 * skill = new Skill(); skill.setSkillName("Java Frameworks");
			 * skill.setTechnology("Java Fullstack"); session.save(skill);
			 * skills.add(skill);
			 * 
			 * skill2 = new Skill(); skill2.setSkillName("Java Frameworks");
			 * skill2.setTechnology("Java Fullstack"); session.save(skill2);
			 * skills.add(skill2);
			 * 
			 * skill1 = new Skill(); skill1.setSkillName("Java Frameworks");
			 * skill1.setTechnology("Java Fullstack"); session.save(skill1);
			 * skills.add(skill1);
			 * 
			 * job = new Job(); job.setTitle("Java Developer");
			 * job.setDescription("Java Frameworks"); job.setOfferedSalary(85000);
			 * job.setLocation("Bengaluru"); job.setSkills(skills); session.save(job);
			 */
			
			job = (Job)session.get(Job.class, 1);
			System.out.println(job);
			
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
