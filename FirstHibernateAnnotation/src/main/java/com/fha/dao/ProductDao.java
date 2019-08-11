package com.fha.dao;

import com.fha.entities.Product;

public interface ProductDao {
	
	int persistProduct(Product product)throws Exception;
}
