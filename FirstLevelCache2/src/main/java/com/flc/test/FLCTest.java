package com.flc.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flc.entities.Employee;
import com.flc.registry.SessionFactoryRegistry;

public class FLCTest {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		Employee employee1 = null;
		Employee employee2 = null;
		Employee employee3 = null;
		Employee employee4 = null;
		Employee employee5 = null;
		Employee employee6 = null;
		Employee employee7 = null;
		Employee employee8 = null;
		Employee employee9 = null;
		Employee employee10 = null;
		
		session = SessionFactoryRegistry.getSessionFactory().openSession();
		
		employee1 = session.get(Employee.class, 1);
		System.out.println(employee1);
		
		employee3 = session.get(Employee.class, 2);
		System.out.println(employee3);
		//System.out.println("Cacheing the data....");
		//session.evict(employee1);
		//session.clear();
		
		employee2 = session.get(Employee.class, 1);
		System.out.println(employee2);
		
		//System.out.println("Cacheing the data....");
		
		employee4 = session.get(Employee.class, 2);
		System.out.println(employee4);
		
		transaction = session.beginTransaction();
		employee5 = new Employee();
		employee5 = session.get(Employee.class, 1);
		employee5.setZip(100639);
		session.update(employee5);
		employee8 = session.get(Employee.class, 1);
		System.out.println(employee8);
		
		
		  employee6 = new Employee(); 
		  employee6 = session.get(Employee.class, 1);
		  employee6.setZip(100741); 
		  session.update(employee6);
		  employee9 = session.get(Employee.class, 1);
		  System.out.println(employee9);
		  
		  employee7 = new Employee(); 
		  employee7 = session.get(Employee.class, 1);
		  employee7.setZip(100859); 
		  session.update(employee7);
		  session.flush();
		  employee10 = session.get(Employee.class, 1);
		  System.out.println(employee10);
		  
		  transaction.commit();
	}
}
