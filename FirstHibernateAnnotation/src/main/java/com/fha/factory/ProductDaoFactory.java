package com.fha.factory;

import com.fha.dao.ProductDao;
import com.fha.dao.ProductDaoImpl;

public class ProductDaoFactory {
	
	public static ProductDao getObject() {
		return new ProductDaoImpl();
	}
}
