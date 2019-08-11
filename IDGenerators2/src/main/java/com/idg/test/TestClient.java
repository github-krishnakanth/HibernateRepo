package com.idg.test;

import org.hibernate.Session;

import com.idg.entities.Customer;
import com.idg.registry.HibernateSessionFactoryRegistry;

public class TestClient {

	public static void main(String[] args) {
		Session session = null;
		Customer customer = null;
		
		session = HibernateSessionFactoryRegistry.getSessionFactory().openSession();
		customer = new Customer();
		customer.setCustomerName("Steven Smith");
		customer.setAddressLine1("WDC");
		customer.setAddressLine2("South America");
		customer.setCity("WC");
		customer.setState("San Andrews");
		customer.setZip(251416);
		customer.setCountry("US");
		customer.setContactNo("9856665552");
		customer.setEmailAddress("steve_smith@gmail.com");
		System.out.println("Customer record persisted into database with Customer ID: "+session.save(customer));
	}
}
