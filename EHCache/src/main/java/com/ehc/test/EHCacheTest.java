package com.ehc.test;

import com.ehc.beans.Product;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EHCacheTest {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Bajaj Cooler");
		product.setDescription("Good to use!!!");
		
		CacheManager cacheManager = new CacheManager();
		Cache pCache = cacheManager.getCache("product");
		pCache.put(new Element(product.getId(), product));
		
		Product product1 = (Product)pCache.get(1).getValue();
		System.out.println(product1.getName());
	}
}
