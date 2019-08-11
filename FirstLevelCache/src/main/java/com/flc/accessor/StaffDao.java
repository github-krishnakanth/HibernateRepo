package com.flc.accessor;

import com.flc.entities.Staff;

public interface StaffDao {
	
	Staff getStaffDetails(int staffNo)throws Exception;
}
