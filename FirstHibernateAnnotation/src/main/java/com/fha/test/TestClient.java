package com.fha.test;

import java.util.Date;

import com.fha.dao.ProductDao;
import com.fha.entities.Product;
import com.fha.factory.ProductDaoFactory;

public class TestClient {
	public static void main(String[] args) throws Exception {
		ProductDao dao = ProductDaoFactory.getObject();
		
		Product product = new Product();
		product.setProductName("Sony LED");
		product.setDescription("Smart Buy - Easy Buy");
		product.setManufacturerName("Sony");
		product.setManufacturedDate(new Date());
		product.setPrice(65000.00f);
		
		System.out.println("Record Inserted Successfully! with Product No: "+dao.persistProduct(product));
	}
}
