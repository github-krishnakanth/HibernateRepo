package com.fs.test;

import com.fs.dao.StaffDao;
import com.fs.factory.StaffFactory;

public class TestClient {

	public static void main(String[] args) {
		StaffDao dao = StaffFactory.getObject();
		System.out.println(dao.getStaff(10));
	}
}
