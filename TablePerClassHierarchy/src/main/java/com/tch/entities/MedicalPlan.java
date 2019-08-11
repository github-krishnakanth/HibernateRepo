package com.tch.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Medical")
public class MedicalPlan extends InsurancePlan implements Serializable{
	private static final long serialVersionUID = -1484973965378028575L;
	
	@Column(name = "copay")
	protected int copay;
	@Column(name = "coverage_type")
	protected String coverageType;
	@Column(name = "network_type")
	protected String networkType;
	
	public int getCopay() {
		return copay;
	}
	public void setCopay(int copay) {
		this.copay = copay;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + copay;
		result = prime * result + ((coverageType == null) ? 0 : coverageType.hashCode());
		result = prime * result + ((networkType == null) ? 0 : networkType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicalPlan other = (MedicalPlan) obj;
		if (copay != other.copay)
			return false;
		if (coverageType == null) {
			if (other.coverageType != null)
				return false;
		} else if (!coverageType.equals(other.coverageType))
			return false;
		if (networkType == null) {
			if (other.networkType != null)
				return false;
		} else if (!networkType.equals(other.networkType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MedicalPlan [copay=" + copay + ", coverageType=" + coverageType + ", networkType=" + networkType
				+ ", planNo=" + planNo + ", planName=" + planName + ", minTenure=" + minTenure + ", maxAge=" + maxAge
				+ "]";
	}
}
