package com.gvl.test;

import org.hibernate.Session;

import com.gvl.entities.Appointment;
import com.gvl.entities.IAppointment;
import com.gvl.registry.SessionFactoryRegistry;

public class GVLTest {

	public static void main(String[] args) {
		Session session = null;
		IAppointment appointment = null;
		try {
		session = SessionFactoryRegistry.getSessionFactory().openSession();
		appointment = session.load(Appointment.class, 1);
		System.out.println(appointment.getClass().getName());
		/*
		 * if(appointment!=null) { System.out.println("not null");
		 * System.out.println("Appointment No: "+appointment.getAppointmentNo()); }
		 */
		System.out.println("Load Completed...");
		System.out.println("Patient Name: "+appointment.getPatientName());
		}finally {
			if(session!=null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
