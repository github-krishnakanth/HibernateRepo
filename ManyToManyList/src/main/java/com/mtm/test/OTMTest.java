package com.mtm.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtm.entities.Order;
import com.mtm.entities.Product;
import com.mtm.util.SessionFactoryRegistry;

public class OTMTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Product product = null;
		Product product1 = null;
		Product product2 = null;
		Order order = null;
		List<Product> products = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			  products = new ArrayList<Product>();
			  product = new Product(); product.setProductName("Oven");
			  product.setDescription("World's Greatest Home Needs Provider!!! Sony");
			  product.setProductType("Kitchen Item"); product.setPrice(15500);
			  session.save(product); products.add(product);
			  
			  product1 = new Product(); product1.setProductName("Air Cooler");
			  product1.setDescription("World's Greatest Home Needs Provider!!! Bluestar");
			  product1.setProductType("Cooler"); product1.setPrice(35700);
			  session.save(product1); products.add(product1);
			  
			  product2 = new Product(); product2.setProductName("Television");
			  product2.setDescription("World's Greatest Home Needs Provider!!! Sony");
			  product2.setProductType("Television"); product2.setPrice(45000);
			  session.save(product2); products.add(product2);
			  
			  order = new Order(); order.setOrderedDate(new Date());
			  order.setPaymentMethod("Wallet"); order.setShippmentType("Normal");
			  order.setStatus("Shipping"); order.setAmount(96200);
			  order.setProducts(products); session.save(order);
			 
			order = (Order)session.get(Order.class, 1);
			System.out.println(order);
			
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
