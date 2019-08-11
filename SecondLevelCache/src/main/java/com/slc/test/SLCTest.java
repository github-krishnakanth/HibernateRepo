package com.slc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;

import com.slc.entities.Block;
import com.slc.entities.Flat;
import com.slc.helper.SessionFactoryRegistry;

public class SLCTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Block block = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		Statistics stats = sessionFactory.getStatistics();
		
		try {
			session = sessionFactory.openSession();
			block = (Block)session.get(Block.class, 1);
			System.out.println("Block Name :"+block.getBlockName());
			Flat flat = block.getFlats().iterator().next();
			System.out.println("Floor Status :"+flat.getFloorStatus());
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		System.out.println("SLC hit: "+stats.getSecondLevelCacheHitCount());
		
		try {
			session = sessionFactory.openSession();
			block = (Block)session.get(Block.class, 1);
			System.out.println("Block Name :"+block.getBlockName());
			Flat flat = block.getFlats().iterator().next();
			System.out.println("Floor Status :"+flat.getFloorStatus());
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}
}
