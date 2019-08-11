package com.flc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", catalog = "christydb")
public class Employee implements java.io.Serializable {
	private static final long serialVersionUID = -9000878298498462469L;
	
	private int eno;
	private String ename;
	private Integer esal;
	private String eaddr1;
	private String eaddr2;
	private String city;
	private String state;
	private Integer zip;
	private String country;

	public Employee() {
	}

	public Employee(int eno) {
		this.eno = eno;
	}

	public Employee(int eno, String ename, Integer esal, String eaddr1, String eaddr2, String city, String state,
			Integer zip, String country) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr1 = eaddr1;
		this.eaddr2 = eaddr2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	@Id
	@Column(name = "eno", unique = true, nullable = false)
	public int getEno() {
		return this.eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	@Column(name = "ename", length = 25)
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Column(name = "esal")
	public Integer getEsal() {
		return this.esal;
	}

	public void setEsal(Integer esal) {
		this.esal = esal;
	}

	@Column(name = "eaddr1", length = 20)
	public String getEaddr1() {
		return this.eaddr1;
	}

	public void setEaddr1(String eaddr1) {
		this.eaddr1 = eaddr1;
	}

	@Column(name = "eaddr2", length = 20)
	public String getEaddr2() {
		return this.eaddr2;
	}

	public void setEaddr2(String eaddr2) {
		this.eaddr2 = eaddr2;
	}

	@Column(name = "city", length = 15)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", length = 20)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zip")
	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	@Column(name = "country", length = 15)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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
		result = prime * result + ((esal == null) ? 0 : esal.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		if (esal == null) {
			if (other.esal != null)
				return false;
		} else if (!esal.equals(other.esal))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr1=" + eaddr1 + ", eaddr2="
				+ eaddr2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
}
