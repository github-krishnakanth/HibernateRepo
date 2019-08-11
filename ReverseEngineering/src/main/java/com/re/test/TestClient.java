package com.re.test;

import java.util.Date;

import com.re.entities.Society;
import com.re.factory.SocietyDaoFactory;

public class TestClient {

	public static void main(String[] args) {
		Society society = new Society();
		society.setSocietyNm("Juventus");
		society.setRegisteredNm("Juventus Prime");
		society.setSocietyRegDate(new Date());
		society.setAddressLine1("Opp. Kundhan Bagh");
		society.setAddressLine2("Jublee Hills");
		society.setCity("Hyderabad");
		society.setState("TS");
		society.setZip(500081);
		society.setCountry("India");
		society.setMobileNbr("7780529239");
		society.setEmailAddress("juve_prime@gmail.com");
		int societyNo = SocietyDaoFactory.getObject().persist(society);
		System.out.println("Success!!!, A New Society has been persisted with Society No:"+societyNo);
	}
}
