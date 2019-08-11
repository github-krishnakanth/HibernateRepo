package com.flc.test;

import com.flc.accessor.StaffDao;
import com.flc.entities.Staff;
import com.flc.factory.StaffDaoFactory;

public class FirstLevelCacheTest {

	public static void main(String[] args) throws Exception {
		StaffDao staffDao = StaffDaoFactory.getObject();
		Staff staff = null;
		
		staff = new Staff();
		staff = staffDao.getStaffDetails(3);
		System.out.println(staff);
		
		staff = staffDao.getStaffDetails(3);
		System.out.println(staff);
	}
}
