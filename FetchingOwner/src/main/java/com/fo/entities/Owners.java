package com.fo.entities;

public class Owners implements java.io.Serializable {
	private static final long serialVersionUID = 6575173910711863155L;
	
	private Integer ownerNo;
	private String ownerFirstNm;
	private String ownerLastNm;
	private String contactNo;
	private String emailAddress;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer zip;
	private String country;

	public Owners() {
	}

	public Owners(String ownerFirstNm, String ownerLastNm, String contactNo, String emailAddress, String addressLine1,
			String addressLine2, String city, String state, Integer zip, String country) {
		this.ownerFirstNm = ownerFirstNm;
		this.ownerLastNm = ownerLastNm;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public Integer getOwnerNo() {
		return this.ownerNo;
	}

	public void setOwnerNo(Integer ownerNo) {
		this.ownerNo = ownerNo;
	}

	public String getOwnerFirstNm() {
		return this.ownerFirstNm;
	}

	public void setOwnerFirstNm(String ownerFirstNm) {
		this.ownerFirstNm = ownerFirstNm;
	}

	public String getOwnerLastNm() {
		return this.ownerLastNm;
	}

	public void setOwnerLastNm(String ownerLastNm) {
		this.ownerLastNm = ownerLastNm;
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
		result = prime * result + ((ownerFirstNm == null) ? 0 : ownerFirstNm.hashCode());
		result = prime * result + ((ownerLastNm == null) ? 0 : ownerLastNm.hashCode());
		result = prime * result + ((ownerNo == null) ? 0 : ownerNo.hashCode());
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
		Owners other = (Owners) obj;
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
		if (ownerFirstNm == null) {
			if (other.ownerFirstNm != null)
				return false;
		} else if (!ownerFirstNm.equals(other.ownerFirstNm))
			return false;
		if (ownerLastNm == null) {
			if (other.ownerLastNm != null)
				return false;
		} else if (!ownerLastNm.equals(other.ownerLastNm))
			return false;
		if (ownerNo == null) {
			if (other.ownerNo != null)
				return false;
		} else if (!ownerNo.equals(other.ownerNo))
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
		return "Owners [ownerNo=" + ownerNo + ", ownerFirstNm=" + ownerFirstNm + ", ownerLastNm=" + ownerLastNm
				+ ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + "]";
	}
}
