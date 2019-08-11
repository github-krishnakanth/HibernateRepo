package com.slc.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;

import com.slc.entities.Employee;
import com.slc.helper.SFRegistry;

public class SLCTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Employee employee = null;
		
		sessionFactory = SFRegistry.getSessionFactory();
		Statistics stats = sessionFactory.getStatistics();
		
		/*
		 * try { session = sessionFactory.openSession(); employee =
		 * (Employee)session.get(Employee.class, 1); System.out.println(employee);
		 * }finally { if(session!=null) { session.close(); } }
		 * 
		 * //sessionFactory.evict(Employee.class);
		 * System.out.println("SLC Hits: "+stats.getSecondLevelCacheHitCount());
		 * 
		 * try { session = sessionFactory.openSession(); employee =
		 * (Employee)session.get(Employee.class, 1); System.out.println(employee);
		 * }finally { if(session!=null) { session.close();
		 * SFRegistry.closeSessionFactory(); } }
		 */
		
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery("from employee e where e.esal<=?");
			query.setInteger(0, 95000);
			query.setCacheable(true);
			List<Employee> employees = query.list();
			System.out.println("employee name: "+employees.get(0).getEname()+" hashcode "+employees.get(0).hashCode());
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery("from employee e where e.esal<=?");
			query.setInteger(0, 95000);
			query.setCacheable(true);
			List<Employee> employees = query.list();
			System.out.println("employee name: "+employees.get(0).getEname()+" hashcode "+employees.get(0).hashCode());
		}finally{
			if(session!=null) {
				session.close();
			}
		}
		
		System.out.println("slc hit : " + stats.getSecondLevelCacheHitCount());
		System.out.println("query hit : " +stats.getQueryCacheHitCount());
		
		SFRegistry.closeSessionFactory();
	}
}
