package com.flc.entities;

import java.io.Serializable;

public class Staff implements Serializable{
	private static final long serialVersionUID = -3542466922146626632L;
	
	protected int staffNo;
	protected String staffFirstName;
	protected String staffLastName;
	protected String type;
	protected String contactNo;
	protected String emailAddress;
	protected String addressLine1;
	protected String addressLine2;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	protected int societyNo;

	public int getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffFirstName() {
		return staffFirstName;
	}
	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}
	public String getStaffLastName() {
		return staffLastName;
	}
	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public int getSocietyNo() {
		return societyNo;
	}
	public void setSocietyNo(int societyNo) {
		this.societyNo = societyNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + societyNo;
		result = prime * result + ((staffFirstName == null) ? 0 : staffFirstName.hashCode());
		result = prime * result + ((staffLastName == null) ? 0 : staffLastName.hashCode());
		result = prime * result + staffNo;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Staff other = (Staff) obj;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null) {
			if (other.addressLine2 != null)
				return false;
		} else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (societyNo != other.societyNo)
			return false;
		if (staffFirstName == null) {
			if (other.staffFirstName != null)
				return false;
		} else if (!staffFirstName.equals(other.staffFirstName))
			return false;
		if (staffLastName == null) {
			if (other.staffLastName != null)
				return false;
		} else if (!staffLastName.equals(other.staffLastName))
			return false;
		if (staffNo != other.staffNo)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", staffFirstName=" + staffFirstName + ", staffLastName=" + staffLastName
				+ ", type=" + type + ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", country=" + country + ", societyNo=" + societyNo + "]";
	}
}
