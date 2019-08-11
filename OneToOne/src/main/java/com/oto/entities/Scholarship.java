package com.oto.entities;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "scholarship")
public class Scholarship implements Serializable {
	private static final long serialVersionUID = 7417121767254056840L;
	
	@Id
	@GeneratedValue(generator = "foreign_gen")
	@GenericGenerator(name = "foreign_gen", strategy = "foreign", parameters = {@Parameter(name="property", value = "admission")})
	@Column(name = "admission_no")
	protected int admissionNo;
	@Column(name = "scholarship_type")
	protected String scholarshipType;
	@Column(name = "sanctioned_dt")
	protected Date sanctionedDate;
	protected String category;
	@Column(name = "sanctioned_amount")
	protected double sanctionedAmount;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	protected Admission admission;

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getScholarshipType() {
		return scholarshipType;
	}

	public void setScholarshipType(String scholarshipType) {
		this.scholarshipType = scholarshipType;
	}

	public Date getSanctionedDate() {
		return sanctionedDate;
	}

	public void setSanctionedDate(Date sanctionedDate) {
		this.sanctionedDate = sanctionedDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getSanctionedAmount() {
		return sanctionedAmount;
	}

	public void setSanctionedAmount(double sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admission == null) ? 0 : admission.hashCode());
		result = prime * result + admissionNo;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sanctionedAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sanctionedDate == null) ? 0 : sanctionedDate.hashCode());
		result = prime * result + ((scholarshipType == null) ? 0 : scholarshipType.hashCode());
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
		Scholarship other = (Scholarship) obj;
		if (admission == null) {
			if (other.admission != null)
				return false;
		} else if (!admission.equals(other.admission))
			return false;
		if (admissionNo != other.admissionNo)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Double.doubleToLongBits(sanctionedAmount) != Double.doubleToLongBits(other.sanctionedAmount))
			return false;
		if (sanctionedDate == null) {
			if (other.sanctionedDate != null)
				return false;
		} else if (!sanctionedDate.equals(other.sanctionedDate))
			return false;
		if (scholarshipType == null) {
			if (other.scholarshipType != null)
				return false;
		} else if (!scholarshipType.equals(other.scholarshipType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scholarship [admissionNo=" + admissionNo + ", scholarshipType=" + scholarshipType + ", sanctionedDate="
				+ sanctionedDate + ", category=" + category + ", sanctionedAmount=" + sanctionedAmount + ", admission="
				+ admission + "]";
	}
}