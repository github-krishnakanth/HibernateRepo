package com.cs.entities;

import java.io.Serializable;

public class Loan implements Serializable{
	private static final long serialVersionUID = 6453626490225973656L;
	protected int loanNo;
	protected String loanType;
	protected float principle;
	protected int tenure;
	protected float interestRate;

	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public float getPrinciple() {
		return principle;
	}
	public void setPrinciple(float principle) {
		this.principle = principle;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(interestRate);
		result = prime * result + loanNo;
		result = prime * result + ((loanType == null) ? 0 : loanType.hashCode());
		result = prime * result + Float.floatToIntBits(principle);
		result = prime * result + tenure;
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
		Loan other = (Loan) obj;
		if (Float.floatToIntBits(interestRate) != Float.floatToIntBits(other.interestRate))
			return false;
		if (loanNo != other.loanNo)
			return false;
		if (loanType == null) {
			if (other.loanType != null)
				return false;
		} else if (!loanType.equals(other.loanType))
			return false;
		if (Float.floatToIntBits(principle) != Float.floatToIntBits(other.principle))
			return false;
		if (tenure != other.tenure)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Loan [loanNo=" + loanNo + ", loanType=" + loanType + ", principle=" + principle + ", tenure=" + tenure
				+ ", interestRate=" + interestRate + "]";
	}
}
