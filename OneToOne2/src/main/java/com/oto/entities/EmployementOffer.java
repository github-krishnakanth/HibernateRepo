package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employement_offer")
public class EmployementOffer implements Serializable {
	private static final long serialVersionUID = -6488827440386771659L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "offer_id")
	protected int offerId;
	@Column(name = "offer_dt")
	protected Date offerDate;
	@Column(name = "candidate_nm")
	protected String candidateName;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;
	protected String designation;
	@Column(name = "date_of_join")
	protected Date dateOfJoin;
	protected float ctc;
	@OneToOne
	protected EmployementOfferPayRoll employementOfferPayRoll;
	
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public Date getOfferDate() {
		return offerDate;
	}
	public void setOfferDate(Date offerDate) {
		this.offerDate = offerDate;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public float getCtc() {
		return ctc;
	}
	public void setCtc(float ctc) {
		this.ctc = ctc;
	}
	public EmployementOfferPayRoll getEmployementOfferPayRoll() {
		return employementOfferPayRoll;
	}
	public void setEmployementOfferPayRoll(EmployementOfferPayRoll employementOfferPayRoll) {
		this.employementOfferPayRoll = employementOfferPayRoll;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + Float.floatToIntBits(ctc);
		result = prime * result + ((dateOfJoin == null) ? 0 : dateOfJoin.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((employementOfferPayRoll == null) ? 0 : employementOfferPayRoll.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((offerDate == null) ? 0 : offerDate.hashCode());
		result = prime * result + offerId;
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
		EmployementOffer other = (EmployementOffer) obj;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (Float.floatToIntBits(ctc) != Float.floatToIntBits(other.ctc))
			return false;
		if (dateOfJoin == null) {
			if (other.dateOfJoin != null)
				return false;
		} else if (!dateOfJoin.equals(other.dateOfJoin))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (employementOfferPayRoll == null) {
			if (other.employementOfferPayRoll != null)
				return false;
		} else if (!employementOfferPayRoll.equals(other.employementOfferPayRoll))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (offerDate == null) {
			if (other.offerDate != null)
				return false;
		} else if (!offerDate.equals(other.offerDate))
			return false;
		if (offerId != other.offerId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployementOffer [offerId=" + offerId + ", offerDate=" + offerDate + ", candidateName=" + candidateName
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", designation=" + designation
				+ ", dateOfJoin=" + dateOfJoin + ", ctc=" + ctc + ", employementOfferPayRoll=" + employementOfferPayRoll
				+ "]";
	}
}
