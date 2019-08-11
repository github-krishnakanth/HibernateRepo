package com.company.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.entity.Company;

public class CompanyTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*
		 * Company company = (Company)session.get(Company.class, 1);
		 * System.out.println(company);
		 */
		/*
		 * Query query = session.createQuery("select c from Company as c"); Query query1
		 * = session.createQuery("from Company"); Query query2 =
		 * session.createQuery("from Company as c"); List<Company> companies =
		 * query.list(); for(Company company : companies) { System.out.println(company);
		 * }
		 */
		
		/*
		 * Query query = session.createQuery("from Company c"); Iterator<Company> itr =
		 * query.iterate(); while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		
		String hql1 = "from Company c where c.companyName = :companyName and c.location = :location";
		String hql2 = "from Company c where c.companyName = ? and c.location = ?";
		Query query = session.createQuery(hql2);		
		/*
		 * query.setParameter("companyName", "TCS"); query.setParameter("location",
		 * "Bangalore");
		 */
		
		query.setParameter(0, "TCS");
		query.setParameter(1, "Bangalore");
		Iterator<Company> itr = query.iterate();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		session.close();
		sessionFactory.close();
	}
}
