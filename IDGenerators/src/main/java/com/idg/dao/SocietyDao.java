package com.idg.dao;

import com.idg.entities.Society;
import com.idg.exception.DataNotPersistedException;

public interface SocietyDao {
	
	int PersistSociety(Society society)throws DataNotPersistedException;
}
