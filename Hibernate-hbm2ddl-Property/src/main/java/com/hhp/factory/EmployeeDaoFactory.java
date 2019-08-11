package com.hhp.factory;

import com.hhp.dao.EmployeeDao;
import com.hhp.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
	
	public static EmployeeDao getObject() {
		return new EmployeeDaoImpl();
	}
}
