package com.fs.entities;

public class Staff implements java.io.Serializable {
	private static final long serialVersionUID = -366136238903282752L;
	private Integer staffNo;
	private String staffFirstNm;
	private String staffLastNm;
	private String type;
	private String contactNo;
	private String emailAddress;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer zip;
	private String country;
	private Integer societyNo;

	public Staff() {
	}

	public Staff(String staffFirstNm, String staffLastNm, String type, String contactNo, String emailAddress,
			String addressLine1, String addressLine2, String city, String state, Integer zip, String country,
			Integer societyNo) {
		this.staffFirstNm = staffFirstNm;
		this.staffLastNm = staffLastNm;
		this.type = type;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.societyNo = societyNo;
	}

	public Integer getStaffNo() {
		return this.staffNo;
	}

	public void setStaffNo(Integer staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffFirstNm() {
		return this.staffFirstNm;
	}

	public void setStaffFirstNm(String staffFirstNm) {
		this.staffFirstNm = staffFirstNm;
	}

	public String getStaffLastNm() {
		return this.staffLastNm;
	}

	public void setStaffLastNm(String staffLastNm) {
		this.staffLastNm = staffLastNm;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSocietyNo() {
		return this.societyNo;
	}

	public void setSocietyNo(Integer societyNo) {
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
		result = prime * result + ((societyNo == null) ? 0 : societyNo.hashCode());
		result = prime * result + ((staffFirstNm == null) ? 0 : staffFirstNm.hashCode());
		result = prime * result + ((staffLastNm == null) ? 0 : staffLastNm.hashCode());
		result = prime * result + ((staffNo == null) ? 0 : staffNo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (societyNo == null) {
			if (other.societyNo != null)
				return false;
		} else if (!societyNo.equals(other.societyNo))
			return false;
		if (staffFirstNm == null) {
			if (other.staffFirstNm != null)
				return false;
		} else if (!staffFirstNm.equals(other.staffFirstNm))
			return false;
		if (staffLastNm == null) {
			if (other.staffLastNm != null)
				return false;
		} else if (!staffLastNm.equals(other.staffLastNm))
			return false;
		if (staffNo == null) {
			if (other.staffNo != null)
				return false;
		} else if (!staffNo.equals(other.staffNo))
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
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", staffFirstNm=" + staffFirstNm + ", staffLastNm=" + staffLastNm
				+ ", type=" + type + ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", country=" + country + ", societyNo=" + societyNo + "]";
	}
}
