package com.fs.factory;

import com.fs.dao.StaffDao;
import com.fs.dao.StaffDaoImpl;

public class StaffFactory {
	
	public static StaffDao getObject() {
		return new StaffDaoImpl();
	}
}
