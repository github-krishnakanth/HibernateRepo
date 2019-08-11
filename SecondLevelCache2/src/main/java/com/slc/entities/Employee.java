package com.slc.entities;

import java.io.Serializable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/*@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "employee")*/
public class Employee implements Serializable {
	private static final long serialVersionUID = -8586062602910949013L;
	
	protected int eno; 
	protected String ename;
	protected int esal;
	protected String eaddr1;
	protected String eaddr2;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEaddr1() {
		return eaddr1;
	}
	public void setEaddr1(String eaddr1) {
		this.eaddr1 = eaddr1;
	}
	public String getEaddr2() {
		return eaddr2;
	}
	public void setEaddr2(String eaddr2) {
		this.eaddr2 = eaddr2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((eaddr1 == null) ? 0 : eaddr1.hashCode());
		result = prime * result + ((eaddr2 == null) ? 0 : eaddr2.hashCode());
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		result = prime * result + esal;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zip;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (eaddr1 == null) {
			if (other.eaddr1 != null)
				return false;
		} else if (!eaddr1.equals(other.eaddr1))
			return false;
		if (eaddr2 == null) {
			if (other.eaddr2 != null)
				return false;
		} else if (!eaddr2.equals(other.eaddr2))
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (esal != other.esal)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr1=" + eaddr1 + ", eaddr2="
				+ eaddr2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
}
