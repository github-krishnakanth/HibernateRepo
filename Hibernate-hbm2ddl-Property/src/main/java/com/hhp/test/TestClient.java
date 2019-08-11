package com.hhp.test;

import com.hhp.dao.EmployeeDao;
import com.hhp.entities.Employee;
import com.hhp.exception.DataNotPersistedException;
import com.hhp.factory.EmployeeDaoFactory;

public class TestClient {
	
	public static void main(String[] args) throws DataNotPersistedException {
		EmployeeDao dao = EmployeeDaoFactory.getObject();
		Employee employee = new Employee();
		employee.setEno(3);
		employee.setEname("Blake");
		employee.setEsal(85000);
		employee.setEaddr1("WDC");
		employee.setEaddr2("Cl.McRoy Garden");
		employee.setCity("WDC");
		employee.setState("WC");
		employee.setZip(100254);
		employee.setCountry("US");
		System.out.println("Employee Persisted Successfully with Employee No: "+dao.persistEmployee(employee));
	}
}
