package com.idg.factory;

import com.idg.dao.SocietyDao;
import com.idg.dao.SocietyDaoImpl;

public class SocietyDaoFactory {
	
	public static SocietyDao getObject() {
		return new SocietyDaoImpl();
	}
}
