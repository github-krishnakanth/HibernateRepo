package com.fo.test;

import com.fo.accessor.OwnersAccessor;
import com.fo.entities.Owners;

public class TestClient {

	public static void main(String[] args) {
		OwnersAccessor accessor = new OwnersAccessor();
		//System.out.println(accessor.getOwner(5006));
		
		Owners owner = new Owners();
		owner.setOwnerFirstNm("Smith");
		owner.setOwnerLastNm("Steven");
		owner.setContactNo("7780529239");
		owner.setEmailAddress("steve_smith@gmail.com");
		owner.setAddressLine1("WDC");
		owner.setAddressLine2("South America");
		owner.setCity("WDC");
		owner.setState("Cl.McRoy");
		owner.setZip(102206);
		owner.setCountry("US");
		
		System.out.println("Success!, Record Inserted with Owner No: "+accessor.persistOwner(owner));
	}
}
