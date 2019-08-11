package com.re.entities;

import java.util.Date;

public class Society implements java.io.Serializable {
	private static final long serialVersionUID = 6619083836822905814L;

	private Integer societyNo;
	private String societyNm;
	private String registeredNm;
	private Date societyRegDate;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer zip;
	private String country;
	private String mobileNbr;
	private String emailAddress;

	public Society() {
	}

	public Society(String societyNm, String registeredNm, Date societyRegDate, String addressLine1, String addressLine2,
			String city, String state, Integer zip, String country, String mobileNbr, String emailAddress) {
		this.societyNm = societyNm;
		this.registeredNm = registeredNm;
		this.societyRegDate = societyRegDate;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.mobileNbr = mobileNbr;
		this.emailAddress = emailAddress;
	}

	public Integer getSocietyNo() {
		return this.societyNo;
	}

	public void setSocietyNo(Integer societyNo) {
		this.societyNo = societyNo;
	}

	public String getSocietyNm() {
		return this.societyNm;
	}

	public void setSocietyNm(String societyNm) {
		this.societyNm = societyNm;
	}

	public String getRegisteredNm() {
		return this.registeredNm;
	}

	public void setRegisteredNm(String registeredNm) {
		this.registeredNm = registeredNm;
	}

	public Date getSocietyRegDate() {
		return this.societyRegDate;
	}

	public void setSocietyRegDate(Date societyRegDate) {
		this.societyRegDate = societyRegDate;
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

	public String getMobileNbr() {
		return this.mobileNbr;
	}

	public void setMobileNbr(String mobileNbr) {
		this.mobileNbr = mobileNbr;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((mobileNbr == null) ? 0 : mobileNbr.hashCode());
		result = prime * result + ((registeredNm == null) ? 0 : registeredNm.hashCode());
		result = prime * result + ((societyNm == null) ? 0 : societyNm.hashCode());
		result = prime * result + ((societyNo == null) ? 0 : societyNo.hashCode());
		result = prime * result + ((societyRegDate == null) ? 0 : societyRegDate.hashCode());
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
		Society other = (Society) obj;
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
		if (mobileNbr == null) {
			if (other.mobileNbr != null)
				return false;
		} else if (!mobileNbr.equals(other.mobileNbr))
			return false;
		if (registeredNm == null) {
			if (other.registeredNm != null)
				return false;
		} else if (!registeredNm.equals(other.registeredNm))
			return false;
		if (societyNm == null) {
			if (other.societyNm != null)
				return false;
		} else if (!societyNm.equals(other.societyNm))
			return false;
		if (societyNo == null) {
			if (other.societyNo != null)
				return false;
		} else if (!societyNo.equals(other.societyNo))
			return false;
		if (societyRegDate == null) {
			if (other.societyRegDate != null)
				return false;
		} else if (!societyRegDate.equals(other.societyRegDate))
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
		return "Society [societyNo=" + societyNo + ", societyNm=" + societyNm + ", registeredNm=" + registeredNm
				+ ", societyRegDate=" + societyRegDate + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
				+ ", mobileNbr=" + mobileNbr + ", emailAddress=" + emailAddress + "]";
	}
}
