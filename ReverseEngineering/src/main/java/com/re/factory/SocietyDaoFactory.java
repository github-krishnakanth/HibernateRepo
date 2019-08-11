package com.re.factory;

import com.re.dao.SocietyDao;
import com.re.dao.SocietyDaoImpl;

public class SocietyDaoFactory {
	
	public static SocietyDao getObject() {
		return new SocietyDaoImpl();
	}
}
