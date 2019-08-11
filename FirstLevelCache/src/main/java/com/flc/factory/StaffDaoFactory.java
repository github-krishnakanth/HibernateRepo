package com.flc.factory;

import com.flc.accessor.StaffDao;
import com.flc.accessor.StaffDaoImpl;

public class StaffDaoFactory {
	
	public static StaffDao getObject() {
		return new StaffDaoImpl();
	}
}
