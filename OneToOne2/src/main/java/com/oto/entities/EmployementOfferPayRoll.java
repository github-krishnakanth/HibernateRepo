package com.oto.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "employement_offer_pay_roll")
public class EmployementOfferPayRoll implements Serializable{
	private static final long serialVersionUID = -3062034831095234465L;
	
	@Id
	@GeneratedValue(generator = "foreign_gen")
	@GenericGenerator(name = "foreign_gen", strategy = "foreign", parameters = {@Parameter(name = "property", value = "employementOfferPayRoll")})
	protected int offerId;
	protected float basic;
	protected float hra;
	protected float pf;
	@Column(name = "medical_claim_amount")
	protected float medicalClaimAmount;
	@Column(name = "special_allowances")
	protected float specialAllowances;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	protected EmployementOffer employementOffer;
	
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getPf() {
		return pf;
	}
	public void setPf(float pf) {
		this.pf = pf;
	}
	public float getMedicalClaimAmount() {
		return medicalClaimAmount;
	}
	public void setMedicalClaimAmount(float medicalClaimAmount) {
		this.medicalClaimAmount = medicalClaimAmount;
	}
	public float getSpecialAllowances() {
		return specialAllowances;
	}
	public void setSpecialAllowances(float specialAllowances) {
		this.specialAllowances = specialAllowances;
	}
	public EmployementOffer getEmployementOffer() {
		return employementOffer;
	}
	public void setEmployementOffer(EmployementOffer employementOffer) {
		this.employementOffer = employementOffer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(basic);
		result = prime * result + ((employementOffer == null) ? 0 : employementOffer.hashCode());
		result = prime * result + Float.floatToIntBits(hra);
		result = prime * result + Float.floatToIntBits(medicalClaimAmount);
		result = prime * result + offerId;
		result = prime * result + Float.floatToIntBits(pf);
		result = prime * result + Float.floatToIntBits(specialAllowances);
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
		EmployementOfferPayRoll other = (EmployementOfferPayRoll) obj;
		if (Float.floatToIntBits(basic) != Float.floatToIntBits(other.basic))
			return false;
		if (employementOffer == null) {
			if (other.employementOffer != null)
				return false;
		} else if (!employementOffer.equals(other.employementOffer))
			return false;
		if (Float.floatToIntBits(hra) != Float.floatToIntBits(other.hra))
			return false;
		if (Float.floatToIntBits(medicalClaimAmount) != Float.floatToIntBits(other.medicalClaimAmount))
			return false;
		if (offerId != other.offerId)
			return false;
		if (Float.floatToIntBits(pf) != Float.floatToIntBits(other.pf))
			return false;
		if (Float.floatToIntBits(specialAllowances) != Float.floatToIntBits(other.specialAllowances))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployementOfferPayRoll [offerId=" + offerId + ", basic=" + basic + ", hra=" + hra + ", pf=" + pf
				+ ", medicalClaimAmount=" + medicalClaimAmount + ", specialAllowances=" + specialAllowances
				+ ", employementOffer=" + employementOffer + "]";
	}
}
