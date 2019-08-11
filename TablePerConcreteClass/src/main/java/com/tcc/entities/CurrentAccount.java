package com.tcc.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "current_account")
@AttributeOverrides({@AttributeOverride(name = "account_no", column = @Column(name="account_no")), 
	@AttributeOverride(name = "account_holder_name", column = @Column(name="account_holder_name")),
	@AttributeOverride(name = "opened_dt", column = @Column(name="opened_dt")),
	@AttributeOverride(name = "balance", column = @Column(name="balance"))})
public class CurrentAccount extends Account {
	private static final long serialVersionUID = -4571989588196726520L;
	
	@Column(name = "over_draft_limit")
	protected double overDraftLimit;
	@Column(name = "company_name")
	protected String companyName;
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(overDraftLimit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CurrentAccount other = (CurrentAccount) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (Double.doubleToLongBits(overDraftLimit) != Double.doubleToLongBits(other.overDraftLimit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", companyName=" + companyName + ", accountNo="
				+ accountNo + ", accountHolderName=" + accountHolderName + ", openedDate=" + openedDate + ", balance="
				+ balance + "]";
	}
}
