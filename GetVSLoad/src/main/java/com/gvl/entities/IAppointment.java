package com.gvl.entities;

import java.util.Date;

public interface IAppointment {
	public void setAppointmentNo(int appointmentNo);
	
	public int getAppointmentNo();
	
	public void setPatientName(String patientName);
	
	public String getPatientName();
	
	public void setDoctor(String doctor);
	
	public String getDoctor();
	
	public void setAppointmentDate(Date appointmentDate);
	
	public Date getAppointmentDate();
	
	public void setDescription(String description);
	
	public String getDescription();
	
	public void setMobileNo(int mobileNo);
	
	public int getMobileNo();
}
