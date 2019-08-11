package com.idg.test;

import java.util.Date;

import com.idg.dao.SocietyDao;
import com.idg.entities.Society;
import com.idg.exception.DataNotPersistedException;
import com.idg.factory.SocietyDaoFactory;

public class TestClient {

	public static void main(String[] args) throws DataNotPersistedException {
		SocietyDao dao = SocietyDaoFactory.getObject();
		
		Society society = new Society();
		society.setSocietyName("Lodha Society");
		society.setRegisteredName("SM Lodha Society");
		society.setSocietyRegisteredDate(new Date());
		society.setAddressLine1("WDC");
		society.setAddressLine2("Cl.McRoy Road");
		society.setCity("WC");
		society.setState("WDC");
		society.setZip(120254);
		society.setCountry("US");
		society.setMobileNo(895623145);
		society.setEmailAddress("lodha_sty@gmail.com");
		System.out.println("Record Persisted Successfully with Society No: "+dao.PersistSociety(society));
	}
}
