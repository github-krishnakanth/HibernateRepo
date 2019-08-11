package com.tch.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "insurance_plan")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "plan_type")
@DiscriminatorValue(value = "regular")
public class InsurancePlan implements Serializable {
	private static final long serialVersionUID = 7451242257917940920L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plan_no")
	protected int planNo;
	@Column(name = "plan_name")
	protected String planName;
	@Column(name = "min_tenure")
	protected int minTenure;
	@Column(name = "max_age")
	protected int maxAge;
	
	public int getPlanNo() {
		return planNo;
	}
	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getMinTenure() {
		return minTenure;
	}
	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxAge;
		result = prime * result + minTenure;
		result = prime * result + ((planName == null) ? 0 : planName.hashCode());
		result = prime * result + planNo;
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
		InsurancePlan other = (InsurancePlan) obj;
		if (maxAge != other.maxAge)
			return false;
		if (minTenure != other.minTenure)
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		if (planNo != other.planNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InsurancePlan [planNo=" + planNo + ", planName=" + planName + ", minTenure=" + minTenure + ", maxAge="
				+ maxAge + "]";
	}
}
