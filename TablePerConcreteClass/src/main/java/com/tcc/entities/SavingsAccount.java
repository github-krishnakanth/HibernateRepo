package com.tcc.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "savings_account")
@AttributeOverrides({@AttributeOverride(name = "account_no", column = @Column(name="account_no")), 
	@AttributeOverride(name = "account_holder_name", column = @Column(name="account_holder_name")),
	@AttributeOverride(name = "opened_dt", column = @Column(name="opened_dt")),
	@AttributeOverride(name = "balance", column = @Column(name="balance"))})
public class SavingsAccount extends Account {
	private static final long serialVersionUID = 5448852684522359331L;
	
	@Column(name = "min_balance")
	protected float minBalance;
	@Column(name = "has_cheque_book_facility")
	protected boolean hasChequeBookFacility;
	@Column(name = "max_withdraws_limit")
	protected float maxWithdrawsLimit;

	public float getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}
	public boolean isHasChequeBookFacility() {
		return hasChequeBookFacility;
	}
	public void setHasChequeBookFacility(boolean hasChequeBookFacility) {
		this.hasChequeBookFacility = hasChequeBookFacility;
	}
	public float getMaxWithdrawsLimit() {
		return maxWithdrawsLimit;
	}
	public void setMaxWithdrawsLimit(float maxWithdrawsLimit) {
		this.maxWithdrawsLimit = maxWithdrawsLimit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasChequeBookFacility ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(maxWithdrawsLimit);
		result = prime * result + Float.floatToIntBits(minBalance);
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
		SavingsAccount other = (SavingsAccount) obj;
		if (hasChequeBookFacility != other.hasChequeBookFacility)
			return false;
		if (Float.floatToIntBits(maxWithdrawsLimit) != Float.floatToIntBits(other.maxWithdrawsLimit))
			return false;
		if (Float.floatToIntBits(minBalance) != Float.floatToIntBits(other.minBalance))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", hasChequeBookFacility=" + hasChequeBookFacility
				+ ", maxWithdrawsLimit=" + maxWithdrawsLimit + ", accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", openedDate=" + openedDate + ", balance=" + balance + "]";
	}
}
