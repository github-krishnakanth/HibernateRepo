package com.hhp.dao;

import com.hhp.entities.Employee;
import com.hhp.exception.DataNotPersistedException;

public interface EmployeeDao {
	int persistEmployee(Employee employee)throws DataNotPersistedException;
}
