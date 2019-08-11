package com.otm.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hql.bo.Flats;
import com.otm.entities.Flat;
import com.otm.util.SessionFactoryRegistry;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Flats flat = null;
		List<Flats> flats = null;
		
		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			//showFlats(session);
			//showFlatsByFlatType(session, "AAA");
			//showFlatsByFlatTypeSqftAndFacing(session, "AAA", 460, 490, "SOUTH");
			//showFlatsByFlatTypeAndSqft(session, Arrays.asList(new String[] {"AAA", "DDD"}), 470);
			//showNoOfFlatsByFlatType(session, "AAA");
			//showNoOfFlatsInBlocks(session);
			//showNoOfFlatsByFlatTypeAndFacing(session);
			//showFlatsByFloor(session, 2);
			//showFlatsByBlockName(session, "AAA");
			//showFlatsAndBlocksByFlatTypeFacingSqftAndUnits(session, "AAA", "SOUTH", 460, 15);
			//showFlatsBetweenFloor(session, 1, 3);
			
			//showFlatsC(session);
			//showFlatsByFlatTypeC(session, "AAA");
			//showFlatsByFlatTypeSqftAndFacingC(session, "AAA", 460, 490, "SOUTH");
			//showFlatsByFlatTypeAndSqftC(session, Arrays.asList(new String[] {"AAA", "DDD"}), 470);
			//showNoOfFlatsByFlatTypeC(session, "AAA");
			//showNoOfFlatsInBlocksC(session);
			//showNoOfFlatsByFlatTypeAndFacingC(session);
			//showFlatsByFloorC(session, 2);
			//showFlatsByBlockNameC(session, "AAA");
			//showFlatsAndBlocksByFlatTypeFacingSqftAndUnitsC(session, "AAA", "SOUTH", 460, 15);
			//showFlatsBetweenFloorC(session, 1, 3);
			//showFlatsByFlatNameDC(session, "AAA");
			
			//showFlatsByFlatTypeNamedQuery(session, "AAA");
			
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
	private static void showFlats(Session session) {
		Query query = null;
		List<Flats> flats = null;
		
		query = session.createQuery("from Flats");
		flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsC(Session session) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class);
		List<Flats> flats = criteria.list();
		for(Flats f : flats) {
			System.out.println(f);
		}
	}
	
	private static void showFlatsByFlatType(Session session, String flatType) {
		Query query = null;
		
		query = session.createQuery("from Flats f where f.flatType = ?");
		query.setParameter(0, flatType);
		List<Flats> flats = query.list();
		for(Flats f : flats) {
			System.out.println(f);
		}
	}
	
	private static void showFlatsByFlatTypeC(Session session, String flatType) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).add(Restrictions.eq("flatType", flatType));
		List<Flats> flats = criteria.list();
		for(Flats f : flats) {
			System.out.println(f);
		}
	}
	
	private static void showFlatsByFlatTypeSqftAndFacing(Session session, String flatType, int minSize, int maxSize, String facing) {
		Query query = null;
		
		query = session.createQuery("from Flats f where f.flatType = :flatType and sqft between :minSize and :maxSize and facing = :facing");
		query.setParameter("flatType", flatType);
		query.setParameter("minSize", minSize);
		query.setParameter("maxSize", maxSize);
		query.setParameter("facing", facing);
		List<Flats> flats = query.list();
		for(Flats f : flats) {
			System.out.println(f);
		}
	}
	
	private static void showFlatsByFlatTypeSqftAndFacingC(Session session, String flatType, int minSize, int maxSize, String facing) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).add(Restrictions.
				and(Restrictions.eq("flatType", flatType),
						Restrictions.and(Restrictions.between("sqft", minSize, maxSize),
								Restrictions.eq("facing", facing))));
		List<Flats> flats = criteria.list();
		for(Flats f : flats) {
			System.out.println(f);
		}
	}
	
	private static void showFlatsByFlatTypeAndSqft(Session session, List<String> flatTypes, int sqft) {
		Query query = null;
		
		query = session.createQuery("from Flats f where f.flatType in (:flatTypes) and f.sqft > :sqft");
		query.setParameter("flatTypes", flatTypes);
		query.setParameter("sqft", sqft);
		List<Flats> flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsByFlatTypeAndSqftC(Session session, List<String> flatTypes, int sqft) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).
				add(Restrictions.and(Restrictions.in("flatType", flatTypes),
						Restrictions.gt("sqft", sqft)));
		List<Flats> flats = criteria.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showNoOfFlatsByFlatType(Session session, String flatType) {
		Query query = null;
		
		query = session.createQuery("select count(f) from Flats f where f.flatType = ?");
		query.setString(0, flatType);
		List<Flats> flatsCount = query.list();
		System.out.println("Flats Count: "+flatsCount.get(0));
	}
	
	private static void showNoOfFlatsByFlatTypeC(Session session, String flatType) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).add(Restrictions.eq("flatType", flatType))
				.setProjection(Projections.count("flatNo"));
		List<Flats> flatsCount = criteria.list();
		System.out.println("Flats Count: "+flatsCount.get(0));
	}
	
	private static void showNoOfFlatsInBlocks(Session session) {
		Query<Object[]> query = null;
		
		query = session.createQuery("select f.block.blockNo, count(f) from Flat f group by f.block.blockNo");
		List<Object[]> records = query.list();
		for(Object[] row : records) {
			System.out.println("block No: "+row[0]+" count: "+row[1]);
		}
	}
	
	private static void showNoOfFlatsInBlocksC(Session session) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flat.class).
				setProjection(Projections.projectionList().
						add(Projections.groupProperty("block.blockNo")).
						add(Projections.count("flatNo")));
		List<Object[]> records = criteria.list();
		for(Object[] row : records) {
			System.out.println("block No: "+row[0]+" count: "+row[1]);
		}
	}
	
	private static void showNoOfFlatsByFlatTypeAndFacing(Session session) {
		Query<Object[]> query = null;
		
		query = session.createQuery("select f.flatType, f.facing, count(f) from Flats f group by f.flatType, f.facing");
		List<Object[]> records = query.list();
		for(Object[] row : records) {
			System.out.println("Flat Type: "+row[0]+" Facing: "+row[1]+" count: "+row[2]);
		}
	}
	
	private static void showNoOfFlatsByFlatTypeAndFacingC(Session session) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).
				setProjection(Projections.projectionList().
						add(Projections.groupProperty("flatType")).
						add(Projections.groupProperty("facing")).
						add(Projections.count("flatNo")));
		List<Object[]> records = criteria.list();
		for(Object[] row : records) {
			System.out.println("Flat Type: "+row[0]+" Facing: "+row[1]+" count: "+row[2]);
		}
	}
	
	private static void showFlatsByFloor(Session session, int floor) {
		Query query = null;
		
		query = session.createQuery("select new Flats(f.flatType, f.facing, f.sqft) from Flats f where f.floor >= ?");
		query.setParameter(0, floor);
		List<Flats> flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsByFloorC(Session session, int floor) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).add(Restrictions.ge("floor", floor));
		List<Flats> flats = criteria.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsByBlockName(Session session, String blockName) {
		Query query = null;
		
		query = session.createQuery("select f from Flats f where f.block.blockName = ?");
		List<Flats> flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsByBlockNameC(Session session, String blockName) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).createAlias("block", "b").add(Restrictions.eq("b.blockName", blockName));
		List<Flats> flats = criteria.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsAndBlocksByFlatTypeFacingSqftAndUnits(Session session, String flatType, String facing, int sqft, int units) {
		Query query = null;
		
		query = session.createQuery("select f, b from Flats f inner join f.block b where f.flatType = :flatType and f.facing = :facing and f.sqft >= :sqft and b.units >= :units");
		query.setString("flatType", flatType);
		query.setString("facing", facing);
		query.setInteger("sqft", sqft);
		query.setInteger("units", units);
		
		List<Flats> flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsAndBlocksByFlatTypeFacingSqftAndUnitsC(Session session, String flatType, String facing, int sqft, int units) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).createAlias("block", "b").add(Restrictions.and(Restrictions.eq("flatType", flatType), Restrictions.eq("facing", facing), Restrictions.ge("sqft", sqft), Restrictions.ge("b.units", units)));
		List<Flats> flats = criteria.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsBetweenFloor(Session session, int minFloor, int maxFloor) {
		Query query = null;
		
		query = session.createQuery("select f from Flats f where f.floor between :minFloor and :maxFloor");
		query.setParameter("minFloor", minFloor);
		query.setParameter("maxFloor", maxFloor);
		List<Flats> flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsBetweenFloorC(Session session, int minFloor, int maxFloor) {
		Criteria criteria = null;
		
		criteria = session.createCriteria(Flats.class).add(Restrictions.and(Restrictions.between("floor", minFloor, maxFloor)));
		List<Flats> flats = criteria.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsByFlatTypeNamedQuery(Session session, String flatType) {
		Query<Flats> query = null;
		
		query = session.getNamedQuery("showFlatsByFlatName");
		query.setParameter("flatType", flatType);
		List<Flats> flats = query.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
	
	private static void showFlatsByFlatNameDC(Session session, String flatName) {
		DetachedCriteria dc = null;
		
		dc = DetachedCriteria.forClass(Flats.class).add(Restrictions.eq("flatName", flatName));
		Criteria criteria = dc.getExecutableCriteria(session);
		List<Flats> flats = criteria.list();
		for(Flats flat : flats) {
			System.out.println(flat);
		}
	}
}

